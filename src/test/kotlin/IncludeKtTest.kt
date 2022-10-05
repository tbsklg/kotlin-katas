import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IncludeKtTest {

    @Test
    fun `Basic Tests`() {
        assertEquals(true, include(intArrayOf(1,2,3,4), 2))
        assertEquals(false, include(intArrayOf(1,2,4,5), 3))
    }
}