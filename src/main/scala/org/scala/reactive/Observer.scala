package org.scala.reactive

trait Observer[-T] {
	def onNext(next: T)
	def onError(error: Exception)
	def onCompleted()
}
