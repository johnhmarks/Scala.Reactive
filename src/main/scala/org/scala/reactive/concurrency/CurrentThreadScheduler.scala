package org.scala.reactive.concurrency

import org.joda.time._
import org.scala.reactive.disposables.Disposable

object CurrentThreadScheduler extends Scheduler {
	def now: Instant = {
		???
	}
	
	def schedule(action: () => Unit): Disposable = {
		???
	}
	
	def schedule(action: () => Unit, delay: Duration): Disposable = {
		???
	}
	
	def scheduleRequired: Boolean = {
		false
	}
}
