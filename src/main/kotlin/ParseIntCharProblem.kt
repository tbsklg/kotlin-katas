class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int {
        return yearsOld.takeWhile { it.isDigit() }.toInt()
    }
}
