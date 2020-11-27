

object BreakingTheRecords {

  // Complete the breakingRecords function below.
  def breakingRecords(scores: Array[Int]): Array[Int] = {
    var i: Int = 1;
    var maxTemp = scores.head
    var minTemp = scores.head
    var bestCount = 0
    var worstCount = 0
    while (i < scores.length) {
      if (scores(i) > maxTemp) {
        bestCount += 1
        maxTemp = scores(i)
      }
      if (scores(i) < minTemp) {
        worstCount += 1
        minTemp = scores(i)
      }
      i += 1
    }

    Array(bestCount, worstCount)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = breakingRecords(scores)
    println(result.mkString(" "))
  }
}
