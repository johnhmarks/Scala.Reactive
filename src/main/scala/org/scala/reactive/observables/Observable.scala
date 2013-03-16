package org.scala.reactive.observables

import org.scala.reactive.observers.{AnonymousObserver, Observer}
import org.scala.reactive.disposables.Disposable

trait Observable[+T] {
	def subscribe(observer: Observer[T]): Disposable
}

object Observable {
  
	def create[T](onSubscribe: Observer[T] => Disposable) {
		???
	}
	
	def create[T](onSubscribe: Observer[T] => () => Unit): Observable[T] = {
		???
	}
	
	def returning[T](value: T): Observable[T] = {
		???
	}
	
	def throwing[T](error: Exception): Observable[T] = {
		???
	}
	
	def empty[T](): Observable[T] = {
		???
	}
	
	def never[T](): Observable[T] = {
		???
	}

  implicit class ObservableExtensions[T](observable: Observable[T]) {
    def subscribe(onNext: T => Unit): Disposable = {
      observable.subscribe(new AnonymousObserver(onNext))
    }

    def subscribe(onNext: T => Unit, onError: Exception => Unit): Disposable = {
      observable.subscribe(new AnonymousObserver(onNext, onError))
    }

    def subscribe(onNext: T => Unit, onCompleted: () => Unit): Disposable = {
      observable.subscribe(new AnonymousObserver(onNext, onCompleted))
    }

    def subscribe(onNext: T => Unit, onError: Exception => Unit, onCompleted: () => Unit): Disposable = {
      observable.subscribe(new AnonymousObserver(onNext, onError, onCompleted))
    }
  }
}
