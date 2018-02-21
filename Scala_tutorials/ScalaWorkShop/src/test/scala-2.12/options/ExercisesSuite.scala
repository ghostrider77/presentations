package options

import org.scalatest.{FreeSpec, Matchers}

class ExercisesSuite extends FreeSpec with Matchers {
  import Exercises._

  "addOne" - {
    "should add 1 to the input optional value" in {
      addOne(Some(0)) shouldEqual Some(1)
      addOne(None) shouldBe empty
    }
  }

  "multiply" - {
    "should multiply two optional integer values" in {
      multiply(Some(2), Some(3)) shouldEqual Some(6)
      multiply(Some(8), Some(6)) shouldEqual Some(48)
      multiply(Some(3), None) shouldBe empty
      multiply(None, Some(2)) shouldBe empty
      multiply(None, None) shouldBe empty
    }
  }

  "applyMap" - {
    "should apply a function for all the element of a list" in {
      val lst: List[Option[Int]] = List(Some(1), Some(3), None, Some(4), None)
      val func: Int => Int = (x: Int) => 2*x + 1

      applyMap(lst, func) shouldEqual List(Some(3), Some(7), None, Some(9), None)
      applyMap(List[Option[Char]](), (c: Char) => List(c)) shouldBe empty
    }
  }

  "filterMap" - {
    "should apply a function for the existing elements only, then extract the result" in {
      val lst: List[Option[Int]] = List(Some(1), Some(3), None, Some(4), None)
      val func: Int => Int = (x: Int) => 2*x + 1

      filterMap(lst, func) shouldEqual List(3, 7, 9)
      filterMap(List[Option[Char]](), (c: Char) => List(c)) shouldBe empty
    }
  }

  "filterFilter" - {
    "should filter the elements where the given predicate holds" in {
      val lst: List[Option[Int]] = List(Some(1), Some(3), None, Some(4), None)
      val pred: Int => Boolean = (x: Int) => x % 3 == 1

      filterFilter(lst, pred) shouldEqual List(1, 4)
    }
  }

}
