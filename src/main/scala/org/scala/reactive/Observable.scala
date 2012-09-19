package org.scala.reactive

trait Observable[T] {
	def subscribe(reactor: Observer[T]): Disposable
}

/*
object Observable {
	def create[T](onSubscribe: Reactor[T] => Closeable): Reactable[T] {
	  
	}
}
*/