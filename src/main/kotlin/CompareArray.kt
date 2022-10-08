fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a == null || b == null) return false

    val sortedA = a.sortedArray()
    val sortedB = b.sortedArray()

    fun compare(a: IntArray, b: IntArray): Boolean {
        if (a.isEmpty() && b.isEmpty()) return true

        return a.get(0).times(a[0]) == b.get(0) && compare(
            a.drop(1).toIntArray(),
            b.drop(1).toIntArray()
        )
    }

    return compare(sortedA, sortedB)
}
