import scala.io._

object BirthdayBar {

  // Complete the birthday function below.
  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    (0 to s.length -m + 1).fold(0)((res, i) => if(s.slice(i, i+m).sum == d) res + 1 else res)
  }

  def main(args: Array[String]) {

    val n = StdIn.readLine.trim.toInt

    val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val d = dm(0).toInt

    val m = dm(1).toInt

    val result = birthday(s, d, m)

    println(result)

  }
}
