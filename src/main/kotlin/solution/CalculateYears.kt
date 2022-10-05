package solution

fun calculateYears(years: Int): Array<Int> {
    val catYears = catYearsFrom(years)
    val dogYears = dogYearsFrom(years)

    return arrayOf(years, catYears, dogYears);
}

fun dogYearsFrom (years: Int): Int {
    if (years == 0) return 0

    return when (years) {
        1 -> 15 + dogYearsFrom(0)
        2 -> 9 + dogYearsFrom(1)
        else -> 5 + dogYearsFrom(years - 1)
    }
}

fun catYearsFrom (years: Int): Int {
    if (years == 0) return 0

    return when (years) {
        1 -> 15 + catYearsFrom(0)
        2 -> 9 + catYearsFrom(1)
        else -> 4 + catYearsFrom(years - 1)
    }
}
