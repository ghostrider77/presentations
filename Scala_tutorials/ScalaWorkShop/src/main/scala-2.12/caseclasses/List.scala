package caseclasses


sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]


object List {

  /*
   * The apply method allows us to create a List with the usual syntax List(1, 2, 3) - which looks like a function call,
   * hence the name `apply` - instead of the too verbose Cons(1, Cons(2, Cons(3, Nil))).
   */
  def apply[A](xs: A*): List[A] =
    if (xs.isEmpty) Nil
    else Cons(xs.head, apply(xs.tail: _*))

  /*
   * Implement the head function that returns the first element of a list.
   */
  def head[A](xs: List[A]): A = xs match {
    case Nil => throw new NoSuchElementException("There is no head element in the empty list")
    case Cons(h, _) => h
  }

  /*
   * Implement the tail function that returns a list containing all but the first element of the original list
   */
  def tail[A](xs: List[A]): List[A] = ???


  /*
   * Implement the concatenation of two lists
   */
  def concat[A](as: List[A], bs: List[A]): List[A] = ???


  /*
   * Change the head element of a list to a given value
   */
  def changeHead[A](xs: List[A], h: A): List[A] = ???

  /*
   * Drop the first n elements from a list
   */
  def drop[A](xs: List[A], n: Int): List[A] = ???


  /*
   * Calculate the length of a given list
   */
  def length[A](xs: List[A]): Int = ???

}