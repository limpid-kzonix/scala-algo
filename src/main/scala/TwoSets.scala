import scala.annotation.tailrec
import scala.io._

object Result {

  /*
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  private def safetyCheck(res: Int) = (if (res > 100) 0 else res)

  private def lmc(a: Int, b: Int) =
    a * b / gdc(a, b)

  @tailrec
  private def gdc(a: Int, b: Int): Int =
    if (b == 0) a else gdc(b, a % b)

  def getTotalX(leftArray: Array[Int], rightArray: Array[Int]): Int = {
    val lmcRes: Int = leftArray.reduce((a, b) => safetyCheck(lmc(a, b)))
    val gdcRes: Int = rightArray.reduce((a, b) => gdc(a, b))
    if (lmcRes == 0) return 0
    (lmcRes to gdcRes).fold(0)((a, e) => if (gdcRes % e == 0 && e % lmcRes == 0) {println(e); a + 1} else a)
  }
}

object TwoSets {
  def main(args: Array[String]) {

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val total = Result.getTotalX(arr, brr)

    println(total)
  }
}
