package revrot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RevRotKtTeste {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test1() {
        println("Fixed Tests: revRot")
        var s = "733049910872815764"
        testing(revRot(s, 5), "330479108928157")
        s = "73304991087281576455176044327690580265896"
        testing(revRot(s, 8), "1994033775182780067155464327690480265895")
        s = "73304991087281576455176044327690580265896896028"
        testing(revRot(s, 8), "1994033775182780067155464327690480265895")

    }
}
