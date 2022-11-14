fun feast(beast: String, dish: String): Boolean {
    fun firstAndLast(x: String): String {
        return x.take(1).plus(x.takeLast(1))
    }

    return firstAndLast(beast).equals(firstAndLast(dish))
}
