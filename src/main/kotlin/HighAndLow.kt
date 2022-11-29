fun highAndLow(numbers: String): String {
    val num = numbers.split(" ").map(String::toInt)
    return "${num.maxOrNull()} ${num.minOrNull()}"
}
