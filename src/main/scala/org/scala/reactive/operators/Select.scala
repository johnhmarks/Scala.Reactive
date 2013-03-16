package org.scala.reactive.operators

import org.scala.reactive.observables.Observable

protected abstract class Select[T] extends Producer[T] {
	def omega[U](selector: T => U): Observable[U]
}
/*
protected class Select[T, TResult] extends Select[TResult] {
	
}
*/