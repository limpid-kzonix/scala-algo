

object MinMaxSum {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Int]) {
    var min = Long.MaxValue
    var max = 0L
    val sum: Long = arr.map(_.toLong).sum
    for (i <- arr.indices) {
      val value = sum - arr(i)
      if (value > max) max = value
      if (value < min) min = value
    }
    println(s"$min $max")
  }
}
