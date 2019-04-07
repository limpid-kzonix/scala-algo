import java.io.PrintWriter

object TimeConversion {
  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = scan.readLine

    val result = timeConversion(s)

    fw.println(result)

    fw.close()
  }

  /*
   * Complete the timeConversion function below.
   */
  /*
* Complete the timeConversion function below.
*/
  def timeConversion(s: String): String = {
    val strings = s.split(":")
    if (strings(strings.length - 1).contains("PM")) {
      strings(0) = if (strings(0).toInt != 12) {
        (strings(0).toInt + 12).toString
      } else if (strings(0).toInt == 12) {
        strings(0)
      } else {
        "00"
      }
      strings(strings.length - 1) = strings(strings.length - 1).slice(0, 2)
    } else if (strings(strings.length - 1).contains("AM")) {
      strings(0) = if (strings(0).toInt == 12) {
        "00"
      } else {
        strings(0)
      }
      strings(strings.length - 1) = strings(strings.length - 1).slice(0, 2)
    } else {
      strings(strings.length - 1) = strings(strings.length - 1).slice(0, 2)
    }
    strings.mkString(":")
  }
}
