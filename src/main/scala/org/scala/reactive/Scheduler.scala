package org.scala.reactive

import org.joda.time._

trait Scheduler {
	def now: Instant
	def schedule(action: => Unit): Closeable
	def schedule(action: => Unit, delay: Duration): Closeable
}
