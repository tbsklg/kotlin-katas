import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsTouringEquationKtTest {

    @Test
    fun `Basic Tests`() {
        assertEquals(true, isTuringEquation("73+42=16"))
        assertEquals(false, isTuringEquation("5+8=13"))
        assertEquals(true, isTuringEquation("10+20=30"))
        assertEquals(true, isTuringEquation("0001000+000200=00030"))
        assertEquals(false, isTuringEquation("1234+5=1239"))
        assertEquals(false, isTuringEquation("71+0=0"))
        assertEquals(true, isTuringEquation("7000+8000=51"))
        assertEquals(true, isTuringEquation("0+0=0"))
    }
}
