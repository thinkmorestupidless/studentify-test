package simple

object Main:

  def main(args: Array[String]): Unit =
    printMsg("Hello, world")
end Main

def printMsg(msg: String): Unit =
  println(msg)
