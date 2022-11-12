import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RemoveCharKtTest {

    @Test
    fun basicTests() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
    }
}
