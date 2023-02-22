package revrot

import kotlin.math.pow

fun revRot(nums: String, sz: Int): String {
    val chunks: List<String> = nums.chunked(sz).filter { it.length == sz }

    val shiftLeft = fun(digits: List<Int>): List<Int> {
        val head = digits[0]
        return digits.drop(1).plus(head)
    }

    val reverseOrRotate = fun(nums: String): String {
        val digits = nums.map { it.digitToInt() }
        val sumOfCubes = digits.map { it.toDouble() }.sumOf { it.pow(3) }.toInt()
        val isEven = sumOfCubes % 2 == 0

        val chunk: List<Int> = when {
            isEven -> digits.reversed()
            else -> shiftLeft(digits)
        }

        return chunk.joinToString("")
    }

    return chunks.joinToString("", transform = reverseOrRotate)
}
