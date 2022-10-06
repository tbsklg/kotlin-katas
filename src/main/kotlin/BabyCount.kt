fun babyCount(x: String): Int? {
    val occurrences = x.lowercase().groupBy { it }.mapValues { (_, values) -> values.size }

    fun countBabiesFrom(occurrences: Map<Char, Int>): Int {
        val b = occurrences.getOrDefault('b', 0)
        val a = occurrences.getOrDefault('a', 0)
        val y = occurrences.getOrDefault('y', 0)

        return when {
            b > 1 && a > 0 && y > 0 -> {
                1 + countBabiesFrom(mapOf(Pair('b', b - 2), Pair('a', a - 1), Pair('y', y - 1)))
            }

            else -> 0
        }
    }

    val numberOfBabies = countBabiesFrom(occurrences)

    return when {
        numberOfBabies > 0 -> numberOfBabies
        else -> null
    }

//    val a = minOf(
//        x.toLowerCase().count { it == 'b' }/2,
//        x.toLowerCase().count { it == 'a' },
//        x.toLowerCase().count { it == 'y' }
//    )
//    return if(a == 0) null else a
}
