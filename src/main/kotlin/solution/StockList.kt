package solution

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        if (lstOfArt.isEmpty()) {
            return ""
        }

        val stockByCategory = lstOfArt
            .groupBy { it.first() }
            .map { it -> Pair(it.key.toString(), it.value.sumOf { it.split(" ").last().toInt() }) }
            .toMap()

        return lstOfCat
            .map { Pair(it, stockByCategory.getOrDefault(it, 0)) }
            .joinToString(" - ") { "(${it.first} : ${it.second})" }
    }
}
