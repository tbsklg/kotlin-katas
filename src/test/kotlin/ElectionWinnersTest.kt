import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ElectionWinnersTest {

    @Test
    fun `Basic Tests`() {
        assertEquals(2, electionsWinners(arrayOf(2, 3, 5, 2), 3))
        assertEquals(0, electionsWinners(arrayOf(1, 3, 3, 1, 1), 0))
        assertEquals(1, electionsWinners(arrayOf(5, 1, 3, 4, 1), 0))
        assertEquals(4, electionsWinners(arrayOf(1, 1, 1, 1), 1))
        assertEquals(0, electionsWinners(arrayOf(1, 1, 1, 1), 0))
        assertEquals(2, electionsWinners(arrayOf(3, 1, 1, 3, 1), 2))
    }
}
