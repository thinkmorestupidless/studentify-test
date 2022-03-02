package simple

object Main {
  import Hello._

  def main(args: Array[String]): Unit =
    printMsg("Hello, world")
}

object Hello {
  def printMsg(msg: String): Unit =
    println(msg)
}
