package scala.coding.org.palindrome

import scala.util.control.Breaks

object arrayPalindrome {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 2, 0, 2, 3, 2)
    arrayPalindrome(arr)
  }

  /**
   * This method checks given array  is palindrome or not
   *
   * @param a -> Given Array
   */
  private def arrayPalindrome(a: Array[Int]): Unit = {
    val break = new Breaks
    val n = a.length
    var flag = 0
    break.breakable {
      for (i <- 0 until n / 2) {
        if (a(i) != a(n - i - 1)) {
          flag = 1
          break.break()
        }
      }
    }

    if (flag == 1) {
      println("Not a Palindrome")
    } else {
      println("IS a Palindrome")
    }
  }
}
