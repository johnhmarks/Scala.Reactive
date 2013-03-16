package org.scala.reactive.observables

import org.scala.reactive.observers.{Observer}
import org.scala.reactive.disposables.Disposable

final class AnonymousObservable[+T](
    private val subscribe: Observer[T] => Disposable)
    extends ObservableBase[T] {
	
	protected def subscribeCore(observer: Observer[T]): Disposable = {
		???
	}
}