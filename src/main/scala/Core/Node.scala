
package Graph {


  class Node {
    var SuperNode: Node = null
    var NodeName: String = null
    var Count: Int = 0

    def details = {
      println(s"NodeName = $NodeName")
      println(s"ParentName = $SuperNode")
    }
  }
}

