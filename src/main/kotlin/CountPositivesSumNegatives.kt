fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input == null) return arrayOf()
    if (input.isEmpty()) return arrayOf()

    val positives = input.filter { it > 0 }.size
    val negatives = input.filter { it < 0 }.sum()

    return arrayOf(positives, negatives)
}

//val (positive, negative) = input.partition { it > 0 }
//return arrayOf(positive.count(), negative.sum())
