package options

object Exercises {

  def addOne(a: Option[Int]): Option[Int] = ???

  def multiply(a: Option[Int], b: Option[Int]): Option[Int] = ???


  /*
   * Expected behaviour:
   *
   *  input:
   *  lst: List[Int] = List(Some(1), None, Some(3))
   *  func = (x: Int) => 2 * x
   *
   *  output: List(Some(2), None, Some(6))
   */
  def applyMap[A, B](lst: List[Option[A]], func: A => B): List[Option[B]] = {
    ???
  }

  /*
   * Expected behaviour:
   *
   *  input:
   *  lst: List[Int] = List(Some(1), None, Some(3))
   *  func = (x: Int) => 2 * x
   *
   *  output: List(2, 6)
   */
  def filterMap[A, B](lst: List[Option[A]], func: A => B): List[B] = {
    ???
  }

  /*
   * Expected behaviour:
   *
   *  input:
   *  lst: List[Int] = List(Some(1), None, Some(3))
   *  p = (x: Int) => x % 3 == 0
   *
   *  output: List(3)
   */
  def filterFilter[A](lst: List[Option[A]], p: A => Boolean): List[A] = {
    ???
  }

}
