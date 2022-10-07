import java.util.*

fun highlight(code: String): String {
    if (code.isEmpty()) return ""

    val (current, next) = parse(code)
    return color(current[0])
        .map { "<span style=\"color: $it\">$current</span>" }
        .orElse("<span></span>")
        .plus(highlight(next))
}

private fun parse(code: String): Pair<String, String> {
    val head = code[0]

    return when {
        head.isDigit() -> Pair(code.takeWhile { it.isDigit() }, code.dropWhile { it.isDigit() })
        else -> Pair(code.takeWhile { it == head }, code.dropWhile { it == head })
    }
}

private fun color(c: Char): Optional<String> {
    return when {
        c.isDigit() -> Optional.of("orange")
        c == 'F' -> Optional.of("pink")
        c == 'R' -> Optional.of("green")
        c == 'L' -> Optional.of("red")
        else -> Optional.empty()
    }
}
