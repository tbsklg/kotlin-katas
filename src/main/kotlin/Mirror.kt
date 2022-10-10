fun mirror(text: String): String {
    val words = text.split(" ")
    val maximumWordLength = words.map { it.length }.maxOf { it }
    val numberOfStars = maximumWordLength + 4

    val mirroredWords = words
        .map { it.reversed() }
        .map { it + " ".repeat(maximumWordLength - it.length) }
        .joinToString("\n") { "* $it *" }

    val border = "*".repeat(numberOfStars)

    return "$border\n$mirroredWords\n$border"
}
