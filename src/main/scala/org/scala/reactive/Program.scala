package org.scala.reactive

object Program {
  def main(args: Array[String]) {
    println("Hello world")
    
    val fred: Observable[Int] = Observable.create[Int](observer => Disposable.empty)
    
  }
}
