import scala.io._

object Result2 {

  /*
   * Complete the 'nonDivisibleSubset' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY s
   */

  def nonDivisibleSubset(k: Int, s: Array[Int]): Int = {
    // Write your code here

  }

}

object Solution {
  def main(args: Array[String]) {

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val k = firstMultipleInput(1).toInt

    val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result2.nonDivisibleSubset(k, s)

    println(result)

  }
}
