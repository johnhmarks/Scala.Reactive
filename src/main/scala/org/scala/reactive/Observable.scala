package org.scala.reactive

trait Observable[+T] {
	def subscribe(observer: Observer[T]): Disposable
	
	def subscribe(onNext: T => Unit) {
	  	subscribe(new AnonymousObserver(onNext))
	}
	
	def subscribe(onNext: T => Unit, onError: Exception => Unit) {
		subscribe(new AnonymousObserver(onNext, onError))
	}
	
	def subscribe(onNext: T => Unit, onCompleted: () => Unit) {
		subscribe(new AnonymousObserver(onNext, onCompleted))
	}
	
	def subscribe(onNext: T => Unit, onError: Exception => Unit, onCompleted: () => Unit) {
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
	
	implicit class MapExtensions[T](observable: Observable[T]) {
		def map[U](projection: T => U): Observable[U] = {
		  throw new NotImplementedError
		}
	}
	
	implicit class FlatMapExtensions[T](observable: Observable[T]) {
		def flatMap[U](projection: T => Observable[U]): Observable[U] = {
		  throw new NotImplementedError
		}
	}
	
	implicit class FilterExtensions[T](observable: Observable[T]) {
		def filter(predicate: T => Boolean): Observable[T] = {
			throw new NotImplementedError
		}
	}
	
	implicit class MergeExtensions[T](observable: Observable[T]) {
		def merge(other: Observable[T]): Observable[T] = {
		  throw new NotImplementedError
		}
	}
	
	implicit class AggregateExtensions[T](observable: Observable[T]) {
		def aggregate(accumulator: (T, T) => T) : Observable[T] = {
		  throw new NotImplementedError
		}
	}
}
