import scala.actors.Actor

class MyActor extends Actor {

  override def act(): Unit = {
    receive {
      case s:String => println("value is + "+s)
      case _=> println("default！！！")
    }
  }

}


object TestActor {

  def main(args: Array[String]): Unit = {

    val actor = new MyActor()
    actor.start()

    actor ! 1000

  }
}
