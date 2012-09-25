package org.scala.reactive

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
