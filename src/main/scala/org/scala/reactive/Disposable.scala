package org.scala.reactive

trait Disposable {
	def close()
}

object Disposable {
	val empty: Disposable = EmptyDisposable
	
	private object EmptyDisposable extends Disposable {
		def dispose() {
		  
		}
	}
}
