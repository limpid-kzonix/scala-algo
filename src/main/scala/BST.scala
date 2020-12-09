object BST extends App {

  case class Node(value: Int, left: Option[Node], right: Option[Node]) {

    def isBST: Boolean = {
      this.isBST(Option(this), Int.MinValue, Int.MaxValue)
    }

    def isBST(node: Option[Node], min: Int, max: Int): Boolean = {
      node match {
        case Some(node) =>
          if (node.value < min || node.value > max) return false
          isBST(node.left, min, node.value-1) && isBST(node.right, node.value-1, max)
        case None => true
      }
    }
  }

  object Node {
    def apply(id: Int): Node = Node(id, None, None)
    def apply(id: Int, left: Node, right: Node): Node =  Node(id, Some(left), Some(right))
  }

  println(Node(4,
    Node(2, Node(1), Node(3)), Node(5)

  ).isBST)


}
