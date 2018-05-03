package Core

import Graph.Node

  object Execute{
    def Main(args:String): Unit = {
      val parent = new Node
      val child = new Node
      child.SuperNode = parent
      parent.details
      child.details
    }
  }

