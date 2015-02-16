package parallel

import akka.actor.{Actor, Props, ActorSystem}
import dispatch._
import dispatch.Defaults._



class MyActor extends Actor{

  def receive = {
    case x:String => http_request(x)
  }

  def http_request(x: String) :Unit = {
    val svc = url(x)
    println(Http(svc OK as.String).apply())
  }

}

object Main extends App{

  val system = ActorSystem("sample")
  //アクターを作成
  val myAkkaActor = system.actorOf(Props[MyActor], "hoge")

  myAkkaActor ! "http://www.yahoo.co.jp/"

  myAkkaActor ! "https://www.google.co.jp/"

  myAkkaActor ! "http://www.bing.com/"



  //アクターを停止
  system.shutdown

}
