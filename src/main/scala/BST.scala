
object BST extends App {

  case class Node(value: Int, left: Option[Node], right: Option[Node])

  object Node {
    def apply(id: Int): Node = Node(id, None, None)

    def isBST(node: Option[Node], min: Int, max: Int): Boolean = {
      node match {
        case Some(node) =>
          println(s" Node = ${node.value}  [min=$min, max=$max]")
          if (node.value < min || node.value > max) return false
          isBST(node.left, min, node.value) && isBST(node.right, node.value, max)
        case None => true
      }
    }

    implicit class NodeExtension(val node: Node) {
      def isBST: Boolean = Node.isBST(Option(node), Int.MinValue, Int.MaxValue)
    }

  }

  object NodeConversions {

    import scala.language.implicitConversions

    implicit def anyToOption[A](a: A): Option[A] = Option.apply(a)
  }

  import BST.NodeConversions._

  println(Node(10, Node(2, None, Node(9)), None).isBST)


}
