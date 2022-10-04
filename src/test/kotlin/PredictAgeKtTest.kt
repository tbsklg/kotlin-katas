import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PredictAgeKtTest {

    @Test
    @Throws(Exception::class)
    fun basicTest() {
        assertEquals(86, predictAge(65, 60, 75, 55, 60, 63, 64, 45))
        assertEquals(79, predictAge(32, 54, 76, 65, 34, 63, 64, 45))
    }
}

