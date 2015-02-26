import IO.{MyAppJSON, MyAppIO}

/**
 * Created by nobezawa on 2015/01/30.
 */
case class Area(id: String, name :String)

object Main {

  def main (args: Array[String]) {
    //println("Hello, World")

    val areaList = List(Area("aream2105", "ginza"), Area("aream2106", "shinbashi"), Area("aream2105", "ginza"))

    val areaIdList = areaList.map( area =>
      area.id
    ).distinct

    val mapList = areaIdList map { areaId =>
      val groupedAreaList = areaList flatMap{ area => if(area.id == areaId) Some(area.name) else None} // aream2105のList
      Map(areaId -> groupedAreaList)
    }
    println(mapList.reduce{(a1, a2) => a1 ++ a2})
    println(Seq(Seq(1,2,3), Seq(), Seq(5,6)) flatMap { x => 10 +: x })


  }

}
