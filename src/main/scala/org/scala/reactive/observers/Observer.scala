package org.scala.reactive.observers

trait Observer[-T] {
	def onNext(next: T)
	def onError(error: Exception)
	def onCompleted()
}
