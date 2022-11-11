package countdig

import kotlin.math.pow

fun nbDig(n: Int, d: Int): Int {
    return generateSequence(0) { it + 1 }
        .take(n + 1)
        .map { it.toDouble() }
        .map { it.pow(2) }
        .map { it.toInt() }
        .joinToString("")
        .filter { it == '0' + d }
        .length
}

//(0..n).map{ (it * it) }.sumBy { it.toString().count{ it == d.toString()[0] } }
