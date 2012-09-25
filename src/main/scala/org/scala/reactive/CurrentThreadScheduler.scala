package org.scala.reactive

import org.joda.time._

object CurrentThreadScheduler extends Scheduler {
	def now: Instant = {
		throw new NotImplementedError
	}
	
	def schedule(action: () => Unit): Disposable = {
		throw new NotImplementedError
	}
	
	def schedule(action: () => Unit, delay: Duration): Disposable = {
		throw new NotImplementedError
	}
	
	def scheduleRequired: Boolean = {
		false
	}
}
