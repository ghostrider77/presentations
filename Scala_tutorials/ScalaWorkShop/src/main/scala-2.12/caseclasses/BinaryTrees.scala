package caseclasses

object BinaryTrees {

  sealed abstract class Tree {
    def isEmpty: Boolean
  }

  case class Node(value: Int, left: Tree, right: Tree) extends Tree {
    def isEmpty: Boolean = false

    override def toString: String = value + left.toString + right.toString // preorder traversal
  }

  case object Empty extends Tree {
    def isEmpty: Boolean = true

    override def toString: String = "."
  }


  def height(t: Tree): Int = ???

  def numberOfNonemptyNodes(t: Tree): Int = ???
}
