import org.scala.reactive.Observable


object Program {
  def main(args: Array[String]) {
    println("Hello world")
    
    val fred = Observable.value(3);
    val fredSubscription = fred.map(x=>x*x)
    	.filter(x=>x<0)
    	.subscribe(x=>println(x))

    val dave = for (x <- fred if x > 0) yield x
    val daveSubscription = dave.subscribe(x=>println(x))
    
    fredSubscription.dispose
    daveSubscription.dispose
  }
}
