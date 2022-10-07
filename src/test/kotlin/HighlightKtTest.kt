import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HighlightKtTest {

    @Test
    fun descriptionExamples() {
        assertCorrect(
            "F3RF5LF7",
            "<span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>"
        )
        assertCorrect(
            "FFFR345F2LL",
            "<span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>"
        )
    }

    private fun assertCorrect(code: String, expected: String) {
        println("Code without syntax highlighting:   $code")
        val actual = highlight(code)
        println("Your code with syntax highlighting: $actual")
        println("Expected syntax highlighting:       $expected")
        assertEquals(expected, actual, "Code: $code")
    }
}
