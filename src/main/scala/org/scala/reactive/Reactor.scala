package org.scala.reactive

trait Reactor[T] {
	def onNext(next: T): Unit
	def onError(error: Exception): Unit
	def onCompleted(): Unit
}
