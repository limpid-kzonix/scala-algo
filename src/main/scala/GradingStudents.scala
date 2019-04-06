import java.io.PrintWriter

object GradingStudents {

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val grades = Array.ofDim[Int](n)

    for (gradesItr <- 0 until n) {
      val gradesItem = scan.readLine.trim.toInt
      grades(gradesItr) = gradesItem
    }

    val result = gradingStudents(grades)

    fw.println(result.mkString("\n"))

    fw.close()
  }

  /*
   * Complete the gradingStudents function below.
   */
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    /*
     * Write your code here.
     */
    grades.map(elem => {
      var next = elem
      if (next > 37) {
        if (elem % 5 != 0) next = elem + (5 - elem % 5)
        if ((next - elem).abs < 3) next
        else elem
      } else next
    })

  }
}
