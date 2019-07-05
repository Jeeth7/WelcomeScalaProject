package Core

import Graph.Node

  object Execute {
    def main(args: Array[String]) = {
      val parent = new Node
      val child:Node = new Node

      parent.NodeName = "Parent"
      child.NodeName = "Child"
      child.SuperNode = parent
      parent.details
      child.details
    }
  }