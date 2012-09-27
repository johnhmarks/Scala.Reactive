package org.scala.reactive

import org.scalatest._

class AnonymousObservableTests extends FunSuite with BeforeAndAfter {
	var anonymousObservable: AnonymousObservable[String] = _
	var subscribe: Observer[String] => Disposable = _
	
	before{
		anonymousObservable = new AnonymousObservable[String](observer => subscribe(observer))
	}
	
	test("subscribe test") {
		
	}
}
