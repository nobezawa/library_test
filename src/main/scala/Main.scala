import IO.{MyAppJSON, MyAppIO}

/**
 * Created by nobezawa on 2015/01/30.
 */
object Main {

  def main (args: Array[String]) {
    //println("Hello, World")
    val ioOuput = new MyAppIO
    val jsonObj = new MyAppJSON
    jsonObj.jsonSimpleParse2
  }

}
