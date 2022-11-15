fun points(games: List<String>): Int {
//    val (x, y) = it.split(":")
    return games
        .map { it.split(":") }
        .map { Pair(it.first().toInt(), it.last().toInt()) }
        .sumOf { (x, y) -> pointsPerGame(x, y) }
}

fun pointsPerGame(x: Int, y: Int): Int {
    if (x > y) return 3
    if (x == y) return 1
    return 0
}
