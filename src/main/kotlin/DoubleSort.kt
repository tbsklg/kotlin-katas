object DoubleSort {
    fun dbSort(a: Array<Any>): Array<Any> {
        val numbersSorted = a.filterIsInstance<Int>().sorted()
        val wordsSorted = a.filterIsInstance<String>().sorted()

        return numbersSorted.plus(wordsSorted).toTypedArray()
    }
}
