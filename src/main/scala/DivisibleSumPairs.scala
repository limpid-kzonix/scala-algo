

object DivisibleSumPairs {


  // Complete the divisibleSumPairs function below.
  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = (0 until n).fold(0)((count, i) => {
    (i + 1 until n).fold(count)((c, j) => if ((ar(i) + ar(j)) % k == 0) c + 1 else c)
  })


  def main(args: Array[String]) {

    val stdin = scala.io.StdIn

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = divisibleSumPairs(n, k, ar)

    println(result)
  }
}
