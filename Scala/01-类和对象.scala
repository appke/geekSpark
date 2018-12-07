class Person(xname: String, xage: Int) {
  val name = xname
  val age = xage

  def sayHello(): Unit = {
    println("Hello ----" + this.name)
  }

  println("直接打印：hello ********* zhangsan")
}


object Test {

  def main(args: Array[String]): Unit = {

    //    var p1 = new Person("kangkange", 13)
    //    p1.sayHello()


    //    val age = 18
    //    if (age < 18 ) {
    //      println("no allow")
    //    } else if (age>=18 && age<=20){
    //      println("allow with other")
    //    } else {
    //      println("allow self")
    //    }

    //    println(1 to 10)
    //    println(1 to (10, 2))
    //    println(1 until 10)
    //    println(1 until (10 ,3 ))

    //    for(i <- 1 to 10 ){
    //      print(i+" ")
    //    }

    //    var count = 0
    //    for(i <- 1 to 10; j <- 1 until 10) {
    //      println("i="+ i +", j="+j)
    //      count += 1
    //    }
    //    println(count)

    //    for (i <- 1 until 10 ;j <- 1 until 10) {
    //      if (i>=j) {
    //        print(i +"*" + j + "="+ i*j+"\t")
    //      }
    //      if (i==j) {
    //        println()
    //      }
    //    }

    //    for(i<- 1 to 10 ;if (i%2) == 0 ;if(i == 4) ){
    //      println(i)
    //    }

    val result = for (i <- 1 to 100; if (i % 10 == 0)) yield i
    //    result.foreach(x => {
    //      println(x)
    //    })
    result.foreach(println)
  }
}
