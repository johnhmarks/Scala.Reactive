package org.scala.reactive

import org.joda.time._

trait Scheduler {
	def now: Instant
	def schedule(action: () => Unit): Disposable
	def schedule(action: () => Unit, delay: Duration): Disposable
}
