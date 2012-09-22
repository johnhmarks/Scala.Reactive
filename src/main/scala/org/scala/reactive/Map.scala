package org.scala.reactive

object Map {
	implicit class Map[T](observable: Observable[T]) {
		def map[U](projection: T => U): Observable[U] = {
		  throw new NotImplementedError
		}
	}
}
