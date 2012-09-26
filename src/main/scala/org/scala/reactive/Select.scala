package org.scala.reactive

protected abstract class Select[T] extends Producer[T] {
	def omega[U](selector: T => U): Observable[U]
}
/*
protected class Select[T, TResult] extends Select[TResult] {
	
}
*/