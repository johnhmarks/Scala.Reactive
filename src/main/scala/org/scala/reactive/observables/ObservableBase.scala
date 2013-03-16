package org.scala.reactive.observables

import org.scala.reactive.concurrency.CurrentThreadScheduler
import org.scala.reactive.disposables.Disposable
import org.scala.reactive.observers.{AutoDetachObserver, Observer}

abstract class ObservableBase[+T] extends Observable[T] {
  
	def subscribe(observer: Observer[T]) : Disposable = {
		val state = new AutoDetachObserver(observer)
		if (CurrentThreadScheduler.scheduleRequired) {
			CurrentThreadScheduler.schedule(() =>{
				state.disposable = subscribeCore(state)
			})
		}
		else {
			state.disposable = subscribeCore(state)  
		}
		state
	}
  
	protected def subscribeCore(observer: Observer[T]): Disposable
}
