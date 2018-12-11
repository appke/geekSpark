case class Human(name:String, age:Int)


object TTest2 {
  def main(args: Array[String]): Unit = {


    val h1 = new Human("lisa", 26)
    val h2 = Human("zhangsan", 23)
    val h3 = Human("zhangsan", 23)

    println(h1.equals(h2)) // false
    println(h3.equals(h2)) // true


//    val tuple = Tuple6(1,3,5,'d',4f,"hello")
//    val tupleIterator = tuple.productIterator
//
//    while (tupleIterator.hasNext) {
//      matchTest(tupleIterator.next())
//    }
//
//
//    def matchTest(x: Any): Unit = {
//      x match {
//        case i:Int => println("type is Int")
//        case 1 => println("value is 1")
//        case 2 => println("value is 2")
//        case s:String => println("type is String")
//        case d:Double => println("type is Double")
//        case _ => println("no match!")
//      }
//    }


  }
}
