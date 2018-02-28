package either

object Exercises {
  type Age = Int
  type UserId = Int
  case class User(id: UserId, name: String, age: Option[Age])

  sealed trait LuckyNumerError
  object UnknownUser extends LuckyNumerError
  object UnknownAge extends LuckyNumerError
  object EvenAge extends LuckyNumerError

  /**
   * Implement ageOf.  It should return the age of the user with the given
   * id or the corresponding LuckyNumerError otherwise.
   */
  def ageOf(users: List[User], id: UserId): Either[LuckyNumerError, Age] = ???

  /**
   * Implement the following function using ageOf and luckyNumberByAge.
   * It should return the lucky number if it is possible to compute it. ("your lucky number is: xxx")
   * In any other case it should return "you are unlucky".
   */
  def tellLuckyNumber(users: List[User], id: UserId): String = ???

  def luckyNumberByAge(age: Age): Either[LuckyNumerError, Int] =
    if (age % 2 == 0) Right(age / 2)
    else Left(EvenAge)
}
