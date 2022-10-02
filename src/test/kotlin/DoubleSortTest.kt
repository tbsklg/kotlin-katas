import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DoubleSortTest {

    @Test
    fun basicTests() {
       assertThat(DoubleSort.dbSort(arrayOf(6, 2, 3, 4, 5))).isEqualTo(arrayOf(2, 3, 4, 5, 6))
       assertThat(DoubleSort.dbSort(arrayOf<Any>("C", "W", "W", "W", 1, 2, 0))).isEqualTo(arrayOf<Any>(0, 1, 2, "C", "W", "W", "W"))
    }
}
