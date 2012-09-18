package org.scala.reactive

trait Reactable[T] {
	def subscribe(reactor: Reactor[T]): Closeable
}
