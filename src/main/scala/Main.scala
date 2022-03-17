import scala.io.Source

object Main extends App {
  def filePath: Seq[String] = Source.fromFile("C://Users//a.szczepanik//Projekty//WC//src//main//scala//Text.txt").getLines.toSeq

  def size(): Int = filePath.size

  size()

  def getElements(): Unit = {
    (0 until 1).map(_ => filePath).map(_.size).foreach(println)
  }

  def countWords(w: Seq[String]): Set[(String, Int)] = {
    w.toSet.map((word: String) => (word, w.count(_ == word)))
  }


  getElements()
  println(countWords(filePath).size)
}

