object ModSystem {
    fun fromNb2Str(n: Int, sys: IntArray): String {
        val product = sys.reduce { acc, it -> it * acc }

        if (product > n && pairwiseCoPrime(sys)) {
            return "-${sys.map { n.mod(it) }.joinToString("--")}-"
        }

        return "Not applicable"
    }

    private fun pairwiseCoPrime(sys: IntArray): Boolean {
        if (sys.isEmpty()) return true

        val head = sys[0]
        val tail = sys.drop(1)

        return tail.all { greatestCommonDivisor(it, head) == 1 }
                && pairwiseCoPrime(tail.toIntArray())
    }

    private fun greatestCommonDivisor(x: Int, y: Int): Int {
        if (y == 0) return x

        return greatestCommonDivisor(y, (x.rem(y)))
    }
}
