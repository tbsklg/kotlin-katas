fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    if (n <= 0) return doubleArrayOf()

    val a = signature[0]
    val b = signature[1]
    val c = signature[2]

    return arrayOf(a).toDoubleArray().plus(tribonacci(arrayOf(b, c, a + b + c).toDoubleArray(), (n - 1)))
}
