package org.scala.reactive

final class AnonymousObservable[+T](
    private val subscribe: Observer[T] => Disposable)
    extends ObservableBase[T] {
	
	protected def subscribeCore(observer: Observer[T]): Disposable = {
		throw new NotImplementedError
	}
}