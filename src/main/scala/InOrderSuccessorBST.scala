
object InOrderSuccessorBST extends App {

  case class Node(value: Int, left: Option[Node], right: Option[Node], parent: Option[Node])

  object Node {
    def apply(id: Int): Node = Node(id, None, None, None)

    def find(node: Option[Node]): Option[Node] = {
      if (node.isDefined) {
        if (node.get.right.isEmpty && node.get.parent.isDefined) {
          return Option.apply(findParent(node.get.parent.get))
        } else {
          return Option.apply(findChild(node.get.right.get))
        }
      }
      Option.empty
    }

    def findParent(node: Node): Node = {
      if (node.parent.isDefined && node.parent.get.value < node.value) {
        findParent(node)
      }
      node
    }

    def findChild(node: Node): Node = {
      if (node.left.isDefined) {
        return findChild(node.left.get);
      }
      if (node.right.isDefined) {
        return findChild(node.right.get)
      }
      node
    }


    implicit class NodeExtension(val node: Node) {
      def isBST: Boolean = Node.find(Option(node))
    }

  }


  object NodeConversions {

    import scala.language.implicitConversions

    implicit def anyToOption[A](a: A): Option[A] = Option.apply(a)
  }


}
