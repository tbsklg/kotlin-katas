package kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwoSumTest {
    fun runTest(r: IntArray, n: Int, refSol: Pair<Int, Int>) {
        val userSol = TwoSum.twoSum(r, n).let { (x, y) -> if (x > y) Pair(y, x) else Pair(x, y) }
        assertEquals(refSol, userSol)
    }

    @Test
    fun `Basic Tests`() {
        runTest(intArrayOf(1, 2, 3), 4, Pair(0, 2))
        runTest(intArrayOf(1234, 5678, 9012), 14690, Pair(1, 2))
        runTest(intArrayOf(2, 2, 3), 4, Pair(0, 1))
    }
}
