package org.scala.reactive

protected abstract class Producer[T] extends Observable[T] {
	
	def subscribe(observer: Observer[T]): Disposable = {
		throw new NotImplementedError
	}
	
	protected def run(observer: Observer[T], cancel: Disposable, setSink: Disposable => Unit): Disposable
}