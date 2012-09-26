package org.scala.reactive

import org.joda.time.Duration

object ObservableExtensions {
	implicit class ObservableExtensions[T](observable: Observable[T]) {
	  
		def aggregate(accumulator: (T, T) => T): Observable[T] = {
			throw new NotImplementedError
		}
		
		def aggregate[TAccumulate](seed: TAccumulate, accumulator: (TAccumulate, T) => TAccumulate): Observable[TAccumulate] = {
			throw new NotImplementedError
		}
		
		def all(predicate: T => Boolean): Observable[T] = {
			throw new NotImplementedError
		}
		
		def amb(right: Observable[T]): Observable[T] = {
			throw new NotImplementedError
		}
		
		def and(right: Observable[T]): Observable[T] = {
			throw new NotImplementedError
		}
		
		def any(): Observable[T] = {
			throw new NotImplementedError
		}
		
		def any(predicate: T => Boolean): Observable[T] = {
			throw new NotImplementedError
		}
		
		def asObservable(): Observable[T] = {
			throw new NotImplementedError
		}
		
		def average[T <: Numeric[T]](): Observable[T] = {
			throw new NotImplementedError
		}
		
		def buffer[TBufferClosing](bufferClosingSelector: ()=>Observable[TBufferClosing]): Observable[List[T]] = {
			throw new NotImplementedError
		}
		
		def buffer(count: Int): Observable[List[T]] = {
			throw new NotImplementedError
		}
		
		def buffer(window: Duration): Observable[List[T]] = {
			throw new NotImplementedError
		}
		
		def buffer[TBufferOpening, TBufferClosing](
				bufferOpenings: Observable[TBufferOpening],
				bufferClosingSelector: () => Observable[TBufferClosing]): Observable[List[T]] = {
			throw new NotImplementedError
		}
		
		def buffer(count: Int, skip: Int): Observable[List[T]] = {
			throw new NotImplementedError
		}
		
		def withFilter(predicate: T => Boolean): Observable[T] = {
			throw new NotImplementedError
		}

		
		def flatMap[U](projection: T => Observable[U]): Observable[U] = {
		  throw new NotImplementedError
		}
			  
		def map[U](projection: T => U): Observable[U] = {
			throw new NotImplementedError
		}
		
		def merge(other: Observable[T]): Observable[T] = {
		  throw new NotImplementedError
		}
		
	}
	
	implicit class IterableObservableExtensions[T](observables: Iterable[Observable[T]]) {
		def amb(): Observable[T] = {
			throw new NotImplementedError
		}
	}	
}
