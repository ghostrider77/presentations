package options.optionstrait

import scala.{Option => _}

sealed trait Option[+A] {
  def map[B](f: A => B): Option[B] = ???

  def flatMap[B](f: A => Option[B]): Option[B] = ???

  def getOrElse[B >: A](default: => B): B = ???

  def filter(p: A => Boolean): Option[A] = ???
}

case class Some[A](get: A) extends Option[A]
case object None extends Option[Nothing]
