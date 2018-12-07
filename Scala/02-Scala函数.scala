object Function {

  def main(args: Array[String]): Unit = {
//    println(max(3, 10))
//    println(fun2(5))
//    println(fun3(2, 3))
//    println(fun3(2))

    val value = ()=>{
      println("---------")
    }

    val value2 = (a:Int, b:Int)=>{
      a + b
    }

    value()
    println(value2(3, 5))


  }

  // 默认参数
  def fun3(a:Int, b:Int=3) ={
    a+b
  }

  // 递归函数
  def fun2(num:Int): Int = {
    if (num == 1) {
      1
    } else {
      num * fun2(num-1)
    }
  }


  def max(a:Int, b:Int) ={
    if (a > b) {
      a
    } else {
      b
    }
  }

}
