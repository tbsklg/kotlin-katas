package solution

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculateYearsKtTest {

    @Test
    fun `one year`() {
        assertArrayEquals(arrayOf(1, 15, 15), calculateYears(1));
    }

    @Test fun `two years`() {
        assertArrayEquals(arrayOf(2, 24, 24), calculateYears(2));
    }

    @Test fun `ten years`() {
        assertArrayEquals(arrayOf(10, 56, 64), calculateYears(10));
    }
}