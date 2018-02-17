package caseclasses

import org.scalatest.{FreeSpec, Matchers}

class BinaryTreesSuite extends FreeSpec with Matchers {
  import BinaryTrees._

  object TestTrees {
    val emptyTree: Tree = Empty
    val tree: Tree = Node(5, Node(4, Node(1, Empty, Empty), Node(2, Empty, Empty)), Node(6, Empty, Empty))
    val elongatedTree: Tree = Node(5, Empty, Node(6, Empty, Node(7, Empty, Node(8, Empty, Empty))))
  }

  "BinaryTrees" - {
    import TestTrees._
    "should have a height function defined" in {
      height(emptyTree) shouldEqual 0
      height(tree) shouldEqual 3
      height(elongatedTree) shouldEqual 4
    }

    "should calculate the number of nonempty nodes correctly" in {
      numberOfNonemptyNodes(emptyTree) shouldEqual 0
      numberOfNonemptyNodes(tree) shouldEqual 5
      numberOfNonemptyNodes(elongatedTree) shouldEqual 4
    }

  }
}
