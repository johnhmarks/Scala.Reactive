package org.scala.reactive.observables

import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scala.reactive.observers.Observer
import org.scala.reactive.disposables.Disposable

@RunWith(classOf[JUnitRunner])
class AnonymousObservableTests extends FunSuite with BeforeAndAfter {
	var anonymousObservable: AnonymousObservable[String] = _
	var subscribe: Observer[String] => Disposable = _
	
	before{
		anonymousObservable = new AnonymousObservable[String](observer => subscribe(observer))
	}
	
	test("subscribe test") {
		
	}
}
