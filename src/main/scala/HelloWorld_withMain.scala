object HelloWorld_withMain {
  def main(args: Array[String]): Unit = {
    println("Hello, World!\n")
    printf("[%-10s]\n", "Hello")
    printf("[%-10s] %d times", "Hello", 10)
    var a = 15
    val b = 16
    printf("\nNo need to put ; ???")
  }
}
