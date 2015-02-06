package Akka

import akka.actor._


/**
 * Created by nobezawa on 2015/02/05.
 */
class MyAkkaActor extends Actor {
  def receive = {
    case x => println(x)
    }

}

object Main extends App {
  val system = ActorSystem("sample")
  //アクターを作成
  val myAkkaActor = system.actorOf(Props[MyAkkaActor], "hoge")

  myAkkaActor ! List(1, 2, 3)

  myAkkaActor ! "hoge"

  myAkkaActor ! "hogehoge"

  //アクターを停止
  system.shutdown
}
