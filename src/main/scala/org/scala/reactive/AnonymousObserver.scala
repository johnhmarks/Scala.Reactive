package org.scala.reactive

class AnonymousObserver[T] extends Observer[T] {
	def onNext(next: T) {
	  throw new NotImplementedError();
	}
	
	def onError(error: Exception) {
	  throw new NotImplementedError();
	}
	
	def onCompleted() {
	  throw new NotImplementedError();
	}
}