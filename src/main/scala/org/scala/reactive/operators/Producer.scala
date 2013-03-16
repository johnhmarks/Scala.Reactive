package org.scala.reactive.operators

import org.scala.reactive.observables.Observable
import org.scala.reactive.observers.Observer
import org.scala.reactive.disposables.Disposable

protected abstract class Producer[T] extends Observable[T] {
	
	def subscribe(observer: Observer[T]): Disposable = {
		???
	}
	
	protected def run(observer: Observer[T], cancel: Disposable, setSink: Disposable => Unit): Disposable
}