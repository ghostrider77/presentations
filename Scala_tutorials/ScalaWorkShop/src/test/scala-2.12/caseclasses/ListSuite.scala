package caseclasses


import org.scalatest.{FreeSpec, Matchers}

class ListSuite extends FreeSpec with Matchers {
  import List._

  object TestLists {
    val emptyIntList: List[Int] = Nil
    val emptyStringList: List[String] = Nil
    val lst1: List[Int] = List(1, 4, 6, 9)
    val lst2: List[Int] = List(10, 20, 30)
    val lst3: List[Char] = List('a', 'u', 'x', 'z')

  }

  "Lists" - {
    import TestLists._
    "should have a tail function defined" in {
      an [Exception] should be thrownBy tail(emptyIntList)
      an [Exception] should be thrownBy tail(emptyStringList)
      tail(lst1) shouldEqual List(4, 6, 9)
    }

    "should concatenate two lists of the same type" in {
      concat(lst1, lst2) shouldEqual List(1, 4, 6, 9, 10, 20, 30)
    }

    "should change the head element of a list" in {
      an [Exception] should be thrownBy changeHead(emptyIntList, 0)
      changeHead(lst2, 5) shouldEqual List(5, 20, 30)
    }

    "should drop the first n element of a list" in {
      drop(emptyIntList, 0) shouldEqual Nil
      drop(lst1, 0) shouldEqual lst1
      drop(lst1, 1) shouldEqual List(4, 6, 9)
      drop(lst1, 2) shouldEqual List(6, 9)
      drop(lst1, 3) shouldEqual List(9)
      drop(lst1, 4) shouldEqual Nil
    }

    "should calculate the length of a list" in {
      List.length(emptyStringList) shouldEqual 0
      List.length(lst3) shouldEqual 4
    }

  }
}
