import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MirrorKtTest {

    @Test
    fun `Basic Tests`() {
        assertEquals("*********\n* olleH *\n* dlroW *\n*********", mirror("Hello World"))
        assertEquals("************\n* srawedoC *\n************", mirror("Codewars"))
    }
}
