package kata

object Kata {
    fun lastIndexOf(head: Node?, value: Any): Int {
        if (head == null) return -1

        return listFrom(head).lastIndexOf(value);
    }

    fun listFrom(head: Node?): List<Any?> {
        return generateSequence(head) { it.next }.map { node -> node.data }.toList()

        //        if (node == null) return listOf()
        //
        //        return listOf(node.data) + toList(node.next);
    }
}

data class Node(val data: Any?, val next: Node? = null)
