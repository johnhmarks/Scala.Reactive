package org.scala.reactive

import scala.NotImplementedError

protected class AutoDetachObserver[-T](
    private val observer: Observer[T])
    extends ObserverBase[T] {
  
	protected def next(value: T) = {
		throw new NotImplementedError
	}
	
	protected def error(error: Exception) = {
		throw new NotImplementedError
	}
	
	protected def completed() = {
		throw new NotImplementedError
	}
	
	var disposable: Disposable = null
}
