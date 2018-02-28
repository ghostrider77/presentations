package either

import org.scalatest.{FreeSpec, Matchers}

class ExercisesSuite extends FreeSpec with Matchers {
  import Exercises._

  "half age" - {
    val users: List[User] =
      List(
        User(1, "Adam", None),
        User(2, "Joe", Some(40)),
        User(3, "Jeff", Some(70)),
        User(9, "Sarah", None),
        User(10, "Bill", Some(120)),
        User(12, "Ivan", Some(32))
      )

    "should return half of the given user's age" in {
      halfAge(users, 2) shouldBe Right(20)
    }

    "should return UnknownUser if there is no user with the given id" in {
      halfAge(users, 4) shouldBe Left(UnknownUser)
    }

    "should return UnknownAge if the age of the given user is unknonwn" in {
      halfAge(users, 9) shouldBe Left(UnknownAge)
    }

    "should work with empty lists" in {
      halfAge(Nil, 2) shouldBe Left(UnknownUser)
    }
  }
}
