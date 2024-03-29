package scala.coding.org

object copyArray {
  def main(args: Array[String]): Unit = {
    val arr1: Array[Int] = Array(1, 3, 1, 5, 17, 99)
    val arr2: Array[Int] = new Array[Int](arr1.length)
    println("The array element of Array A is: " + arr1.mkString(","))
    copyOneArrayFromAnotherArray(arr1, arr2)
    println("The copied array element from array A to array B is: " + arr2.mkString(","))
  }

  /**
   * Program to copy all the elements of one array into another array.
   *
   * @param arr1 -> Array containing elements
   * @param arr2 -> Array containing copied elements from Array A
   * @return -> copy all the element from arr1 to arr2
   */
  private def copyOneArrayFromAnotherArray(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    for (i <- arr1.indices) {
      arr2(i) = arr1(i)
    }
    arr2
  }
}
