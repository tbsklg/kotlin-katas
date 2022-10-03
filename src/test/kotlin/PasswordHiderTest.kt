import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PasswordHiderTest {

    @Test
    fun hidePasswordFromConnection() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    }
}
