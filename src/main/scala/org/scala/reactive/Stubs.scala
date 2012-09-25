package org.scala.reactive

protected object Stubs {
	def onNext[T] = (value: T) => {}
	def onError: Exception => Unit = (error) => { throw error }
	def onCompleted = () => {}
}
