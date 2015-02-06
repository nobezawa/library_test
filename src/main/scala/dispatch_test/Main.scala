package dispatch_test

import dispatch._
import dispatch.Defaults._

/**
 * Created by nobezawa on 2015/02/06.
 */
object Main extends App{

  val svc = url("https://www.google.co.jp/")
  val request = Http(svc OK as.String)
  for (c <- request){
    println(c)
  }





}
