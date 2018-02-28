package either

import org.scalatest.{FreeSpec, Matchers}

class ExercisesSuite extends FreeSpec with Matchers {
  import Exercises._

  val users: List[User] =
    List(
      User(1, "Adam", None),
      User(2, "Joe", Some(40)),
      User(3, "Jeff", Some(70)),
      User(9, "Sarah", None),
      User(10, "Bill", Some(120)),
      User(12, "Ivan", Some(32))
    )

  "half age" - {
    "should return the given user's age" in {
      ageOf(users, 2) shouldBe Right(40)
    }

    "should return UnknownUser if there is no user with the given id" in {
      ageOf(users, 4) shouldBe Left(UnknownUser)
    }

    "should return UnknownAge if the age of the given user is unknonwn" in {
      ageOf(users, 9) shouldBe Left(UnknownAge)
    }

    "should work with empty lists" in {
      ageOf(Nil, 2) shouldBe Left(UnknownUser)
    }
  }

  "tell lucky number" - {
    "should return half of the given user's age" in {
      tellLuckyNumber(users, 2) should include("20")
    }

    "should return UnknownUser if there is no user with the given id" in {
      tellLuckyNumber(users, 4) should include("you are unlucky")
    }

    "should return UnknownAge if the age of the given user is unknonwn" in {
      tellLuckyNumber(users, 9) should include("you are unlucky")
    }
  }
}
