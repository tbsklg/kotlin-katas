import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ModSystemTest {

    private fun testing(n: Int, bases: IntArray, expect: String) {
        val actual: String = ModSystem.fromNb2Str(n, bases)
        assertEquals(expect, actual)
    }

    @Test
    fun basicTests() {
        testing(779, intArrayOf(8, 7, 5, 3), "-3--2--4--2-")
        testing(187, intArrayOf(8, 7, 5, 3), "-3--5--2--1-")
        testing(259, intArrayOf(8, 7, 5, 3), "-3--0--4--1-")
        testing(15, intArrayOf(8, 6, 5, 3), "Not applicable")
        testing(15, intArrayOf(3, 2), "Not applicable")
    }
}
