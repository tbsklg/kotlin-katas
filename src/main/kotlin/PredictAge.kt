import kotlin.math.sqrt

fun predictAge(vararg ages: Int): Int {
    return (sqrt(ages.sumOf { it * it }.toDouble()) / 2).toInt()
//    ages.map { it * it }
//        .sum()
//        .toDouble()
//        .let { sqrt(it) }
//        .div(2)
//        .toInt()
}
