package org.scala.reactive

protected abstract class Sink[T](private val observer: Observer[T], private val cancel: Disposable) extends Disposable {
	def dispose() {
		
	}
	
	def getForwarder(): Observer[T] = {
		throw new NotImplementedError
	}
}