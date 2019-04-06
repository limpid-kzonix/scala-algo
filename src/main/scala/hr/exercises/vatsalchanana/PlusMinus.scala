

object PlusMinus {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val unit = plusMinus(arr)
    printf("%1.6f\n", unit._1)
    printf("%1.6f\n", unit._2)
    printf("%1.6f\n", unit._3)
  }

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]): (Double, Double, Double) = {
    var plus = 0
    var minus = 0
    var zero = 0
    var len = arr.length
    for (elem <- arr) {
      if (elem > 0) {
        plus = plus + 1
      } else if (elem < 0) {
        minus = minus + 1
      } else {
        zero = zero + 1
      }
    }
    (plus.toDouble / len.toDouble, minus.toDouble / len.toDouble, zero.toDouble / len.toDouble)
  }
}
