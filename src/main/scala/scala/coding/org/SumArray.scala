package main.scala.org.coding.questions.mayank

object SumArray {
  /**
    * Program to print the sum of all the elements of an array.
    */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 3, 4, 42, 10)
    var sum = 0
    for (i <- 0 to a.length - 1) {
      sum += a(i)
    }
    println(sum)
  }
}
