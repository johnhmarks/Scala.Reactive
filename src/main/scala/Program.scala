import org.scala.reactive.Observable


object Program {
  def main(args: Array[String]) {
    println("Hello world")
    
    val fred = Observable.value(3);
    val subscription = fred.map(x=>x*x)
    	.filter(x=>x<0)
    	.subscribe(x=>println(x))
  }
}
