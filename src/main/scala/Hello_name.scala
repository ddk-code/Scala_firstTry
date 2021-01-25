import scala.io.StdIn

object Hello_name extends App {

  val name = StdIn.readLine("Hi! What's your name?\n")

  println("Nice to meet you, " + name + "!")
}
