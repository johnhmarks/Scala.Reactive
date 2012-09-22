package org.scala.reactive

trait ConnectableObservable[T] extends Observable[T] {
	def connect(): Disposable
}
