package IO

import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
 * Created by nobezawa on 2015/01/30.
 */

case class User(name:String,age:Int,email:String,isAlive:Boolean)
case class ListUser(user: List[User])

class MyAppJSON {

  val jsonData = """{"name" : "toto","age" : 25,"email" : "toto@jmail.com","isAlive" : true}"""
  val jsonListData = """{"user":{"name" : "toto","age" : 25,"email" : "toto@jmail.com","isAlive" : true}}"""

  def jsonSimpleParse :Unit = {
    implicit val user = Json.reads[User]
    val res = Json.fromJson(Json.parse(jsonData))
    val name :String = res.map(user => user.name).get
    println(name)
  }

  def jsonSimpleParse2 :Unit = {
    implicit val placeReads: Reads[User] = (
        (JsPath \ "user" \ "name").read[String] and
        (JsPath \ "user" \ "age").read[Int] and
        (JsPath \ "user" \ "email").read[String] and
        (JsPath \ "user" \ "isAlive").read[Boolean]
      )(User.apply _)
    val res = Json.fromJson(Json.parse(jsonListData))
    val name :String = res.map(user => user.name).get
    println(name)
  }

  def jsonListParse :Unit = {
    //implicit val user = Json.reads[ListUser]
    //val rs = Json.fromJson(Json.parse(jsonListData))
    //val name = res.map(user => user.user(1)).get
    println("aaa")
  }

}
