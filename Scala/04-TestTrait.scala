
trait Speak {
  def speak(name:String): Unit = {
    println(name+"---正在说！")
  }
}

trait Listen {

  def listen(name:String): Unit ={
    println(name+"---正在听！")
  }
}

class Person() extends Speak with Listen {

}



object TestTrait {

  def main(args: Array[String]): Unit = {

    var p = new Person()
    p.speak("Junchen")
    p.listen("Junchen222")


  }
}
