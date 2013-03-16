package org.scala.reactive.observables

import org.scala.reactive.disposables.Disposable


trait ConnectableObservable[T] extends Observable[T] {
	def connect(): Disposable
}
