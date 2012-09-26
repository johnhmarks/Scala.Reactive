package org.scala.reactive

trait Observable[+T] {
	def subscribe(observer: Observer[T]): Disposable
	
	def subscribe(onNext: T => Unit): Disposable = {
	  	subscribe(new AnonymousObserver(onNext))
	}
	
	def subscribe(onNext: T => Unit, onError: Exception => Unit): Disposable = {
		subscribe(new AnonymousObserver(onNext, onError))
	}
	
	def subscribe(onNext: T => Unit, onCompleted: () => Unit): Disposable = {
		subscribe(new AnonymousObserver(onNext, onCompleted))
	}
	
	def subscribe(onNext: T => Unit, onError: Exception => Unit, onCompleted: () => Unit): Disposable = {
		subscribe(new AnonymousObserver(onNext, onError, onCompleted))
	}
}

object Observable {
  
	def create[T](onSubscribe: Observer[T] => Disposable) {
		throw new NotImplementedError
	}
	
	def create[T](onSubscribe: Observer[T] => () => Unit): Observable[T] = {
		throw new NotImplementedError
	}
	
	def value[T](value: T): Observable[T] = {
		throw new NotImplementedError
	}
	
	def error[T](error: Exception): Observable[T] = {
		throw new NotImplementedError
	}
	
	def empty[T](): Observable[T] = {
		throw new NotImplementedError
	}
	
	def never[T](): Observable[T] = {
		throw new NotImplementedError
	}
}
