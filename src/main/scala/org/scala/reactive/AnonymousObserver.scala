package org.scala.reactive

final class AnonymousObserver[T](
    private val on: T => Unit,
    private val oe: Exception => Unit,
    private val oc: () => Unit)
    extends ObserverBase[T] {
	
	def this(onNext: T => Unit) {
		this(onNext, Stubs.onError, Stubs.onCompleted)
	}
	
	def this(onNext: T => Unit, onCompleted: () => Unit) {
		this(onNext, Stubs.onError, onCompleted)
	}
  
	def this(onNext: T => Unit, onError: Exception => Unit) {
		this(onNext, onError, Stubs.onCompleted)
	}
	
	protected def next(value: T) = {
		on(value)
	}
	
	protected def error(error: Exception) = {
		oe(error)
	}
	
	protected def completed() = {
		oc()
	}
}