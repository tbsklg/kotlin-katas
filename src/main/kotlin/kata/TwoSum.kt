package kata

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int> {
        if (numbers.isEmpty()) {
            return Pair(-1, -1)
        }

        fun go(indicesToNumbers: List<Pair<Int, Int>>): Pair<Int, Int> {
            val head = indicesToNumbers[0]
            val tail = indicesToNumbers.drop(1)

            return tail
                .find { head.second + it.second == target }
                ?.let { Pair(head.first, it.first) }
                ?: go(tail)
        }

        return go(numbers.indices.toList().zip(numbers.toList()))
    }
}
