import scala.collection.mutable.ArrayBuffer

case class PriorityList(n: Int) {
  val _ns: ArrayBuffer[Int] = new ArrayBuffer[Int]()
  _ns.addOne(n)

  def add(ns: Int*): PriorityList = {
    ns.foreach(_ns.addOne)
    this
  }

  def foreach(): Unit = {
    _ns.map(n => println(n))
  }

  def tail: PriorityList = {
    val x = _ns.tail
    val PL = PriorityList(x.head)
    x.tail.foldLeft(PL) {
      (result, e) => result.add(e)
    }
  }

  def head: Int = {
    _ns.max
  }

  override def toString: String = {
    s"${_ns.sortInPlace().mkString(", ")}"
  }
}

object MyList extends App {
  val myList = PriorityList(2)

  println(myList.add(6).add(1))
  myList.foreach()
  println(myList.head)
  println(myList.tail)
}
