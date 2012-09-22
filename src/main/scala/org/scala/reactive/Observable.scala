package org.scala.reactive

trait Observable[T] {
	def subscribe(observer: Observer[T]): Disposable
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
	  
	implicit class ObservableExtensions[T](observable: Observable[T]) {
	  def subscribe(onNext: T => Unit) {
		  throw new NotImplementedError
		}
		
		def subscribe(onNext: T => Unit, onError: Exception => Unit) {
		  throw new NotImplementedError
		}
		
		def subscribe(onNext: T => Unit, onCompleted: => Unit) {
		  throw new NotImplementedError
		}
		
		def subscribe(onNext: T => Unit, onError: Exception => Unit, onCompleted: => Unit) {
		  throw new NotImplementedError
		}
	}
	
	implicit class Map[T](observable: Observable[T]) {
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
