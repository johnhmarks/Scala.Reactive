package org.scala.reactive.observers

import scala.concurrent.stm._
import org.scala.reactive.disposables.Disposable

abstract class ObserverBase[-T] extends Observer[T] with Disposable {
	private val isStopped = Ref(false);
  
	def onNext(value: T) {
		atomic { implicit txn =>
			if (!isStopped())
			{
			  this.next(value)
			}
		}
	}
	
	def onError(error: Exception) {
		atomic { implicit txn =>
			if (!isStopped()) {
				isStopped.set(true);
				this.error(error)
			}
		}
	}
	
	def onCompleted() {
		atomic { implicit txn =>
			if (!isStopped()) {
				isStopped.set(true);
				this.completed()
			}
		}
	}
	
	def dispose() {
		atomic { implicit txn =>
			isStopped.set(true)
		}
	}
	
	protected def next(value: T)
	protected def error(error: Exception)
	protected def completed()
}
