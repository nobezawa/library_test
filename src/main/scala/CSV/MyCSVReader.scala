package CSV

import java.io.File

import com.github.tototoshi.csv._

case class ListCSV(key :String , link :String, name :String)

/**
 * Created by nobezawa on 2015/02/16.
 */
object MyCSVReader extends App {
  val reader = CSVReader.open(new File("C:/Users/nobezawa/alfa/maybe.csv"))
  //val it = reader.iterator
  //  while (it.hasNext){
  //    if(it.next.last == ""){
  //      println(it.next.tail.head + " 空でした")
  //    }else{
  //      println(it.next.tail.head + it.next.last)
  //    }
  //  }
  //println(editName(reader.all()))
  var list :List[List[String]] = List.empty
  reader foreach  {
    n => if(n.last == "") list :: List(n.head, n.tail.head, "空です") else list :: List(n.head, n.tail.head, n.last)
    //n => println(getAreaName(ListCSV(n.head, n.tail.head, n.last)))
  }
  val list2 = list :: List("a", "a", "a")
  println(list2)

  def getAreaName(l :ListCSV)  :List[String] = {
    if(l.name == ""){
      val list = List(l.key, l.link, "空です")
      list
    }else{
      val list = List(l.key, l.link, l.name)
      list
    }
  }

  def editName(l :List[List[String]]) = {


  }


}
