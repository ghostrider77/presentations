package either

object Exercises {
  type Age = Int
  type UserId = Int
  case class User(id: UserId, name: String, age: Option[Age])

  sealed trait HalfAgeError
  object UnknownUser extends HalfAgeError
  object UnknownAge extends HalfAgeError

  def halfAge(users: List[User], id: UserId): Either[HalfAgeError, Age] = ???
}
