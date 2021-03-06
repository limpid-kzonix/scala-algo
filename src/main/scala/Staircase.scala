object Staircase {

  // Complete the staircase function below.
  def staircase(n: Int) {
    for (i <- 1 to n) {
      var spaces = " " * (n - i)
      var sharp = "#" * i
      println(spaces + sharp)
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    staircase(n)
  }
}
