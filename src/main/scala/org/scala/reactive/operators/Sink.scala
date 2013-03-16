package org.scala.reactive.operators

import org.scala.reactive.observers.Observer
import org.scala.reactive.disposables.Disposable

protected abstract class Sink[T](private val observer: Observer[T], private val cancel: Disposable) extends Disposable {
	def dispose() {
		
	}
	
	def getForwarder(): Observer[T] = {
		???
	}
}