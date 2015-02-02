package IO

import scalax.file.Path

/**
 * Created by nobezawa on 2015/01/30.
 */
class MyAppIO {

  def createDir :Unit = {
    val dirPath = Path(("C:/Users/nobezawa/alfa"))
    dirPath.createDirectory()
  }

  def createFile :Unit = {
    val filePath = Path(("C:/Users/nobezawa/alfa/hoge.txt"))
    filePath.createFile()
  }

  def writeFile :Unit = {
    val filePath = Path(("C:/Users/nobezawa/alfa/hoge.txt"))
    if (filePath.isFile) filePath.write("alfa")
  }

}
