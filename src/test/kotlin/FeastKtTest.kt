import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FeastKtTest {

    @Test
    fun testFixed() {
        assertEquals(true, feast("great blue heron", "garlic naan"))
        assertEquals(true, feast("chickadee", "chocolate cake"))
        assertEquals(false, feast("brown bear", "bear claw"))
        assertEquals(true, feast("marmot", "mulberry tart"))
        assertEquals(true, feast("porcupine", "pie"))
        assertEquals(false, feast("electric eel", "lasagna"))
        assertEquals(true, feast("slow loris", "salsas"))
        assertEquals(true, feast("ox", "orange lox"))
        assertEquals(true, feast("blue-footed booby", "blueberry"))
    }
}
