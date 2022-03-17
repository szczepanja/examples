import scala.io.Source

object WC extends App {
  def filePath: Seq[String] = Source.fromFile("C://Users//a.szczepanik//Projekty//WC//src//main//scala//Text.txt").getLines.toSeq

  def size(): Int = filePath.size

  def getElements: Int = {
    filePath.flatMap(line => line.split("")).count(_.nonEmpty)
  }
//  filePath.map(_.length).sum - sprawdzam długość każdego z elementów, a potem sumuje

  def countWords(w: Seq[String]): Set[(String, Int)] = {
    w.toSet.map((word: String) => (word, w.count(_ == word)))
  }

  println(size())
  println(getElements)
  println(countWords(filePath).size)
}
