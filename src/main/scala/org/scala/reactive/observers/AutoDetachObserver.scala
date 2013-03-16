package org.scala.reactive.observers

import org.scala.reactive.disposables.Disposable

class AutoDetachObserver[-T](
    private val observer: Observer[T])
    extends ObserverBase[T] {
  
	protected def next(value: T) = {
		???
	}
	
	protected def error(error: Exception) = {
		???
	}
	
	protected def completed() = {
		???
	}
	
	var disposable: Disposable = null
}
