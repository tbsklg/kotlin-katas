class CircularList<T>(vararg val elements: T) {

    var index = -1

    init {
        if (elements.isEmpty()) throw java.lang.RuntimeException()
    }

    fun next(): T {
        return elements[++index % elements.size]
    }

    fun prev(): T {
        if (index - 1 < 0) index = elements.size - 1 else index--
        return elements[index % elements.size]
    }
}
