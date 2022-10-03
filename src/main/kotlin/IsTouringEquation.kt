import java.util.regex.Pattern

fun isTuringEquation(s: String): Boolean {
    val pattern = Pattern.compile("^(\\d+)\\+(\\d+)=(\\d+)$")
    val matcher = pattern.matcher(s)

    return when {
        matcher.matches() -> {
            val a = matcher.group(1).reversed().toBigInteger()
            val b = matcher.group(2).reversed().toBigInteger()
            val c = matcher.group(3).reversed().toBigInteger()
            a.plus(b) == c
        }
        else -> false
    }

//    s.split('+', '=').map { it.reversed().toInt() }.let { it[0] + it[1] == it[2] }
}
