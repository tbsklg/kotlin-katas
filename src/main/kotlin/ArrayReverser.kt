fun reverse(a: List<String>): List<String> {
    val joinedAndReversed = a.joinToString("").reversed()
    val chunkLengths = a.map { s -> s.length }

    return chunk(joinedAndReversed, chunkLengths)
}

fun chunk(toChunk: String, chunkLengths: List<Int>): List<String> {
    if (toChunk.isEmpty() || chunkLengths.isEmpty()) return listOf()

    val (head, tail) = chunkLengths.destructure()
    val toBeChunked = toChunk.drop(head)

    return listOf(toChunk.take(head)).plus(chunk(toBeChunked, tail))
}

fun <T> List<T>.destructure() = Pair(get(0), drop(1))

//fun reverse(a: List<String>): List<String> {
//    val str = a.joinToString("").reversed().iterator()
//    return a.map { Array(it.length) { str.nextChar() }.joinToString("") }
//}

//fun <T> List<T>.tail() = drop(1)
//
//fun reverse(a: List<String>): List<String> {
//    tailrec fun test(x: String, y: List<Int>, z: List<String>): List<String> {
//        if (x.isEmpty()) return z
//
//        return test(x.drop(y.first()), y.tail(), z + listOf(x.take(y.first())) )
//    }
//    return test(a.joinToString ("").reversed(), a.map { it.length }, listOf())
//}
