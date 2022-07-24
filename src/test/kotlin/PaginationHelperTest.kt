import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class PaginationHelperTest {

    @Nested
    inner class ItemCountTest {

        @Test
        fun shouldCalculateItemsForNumbers() {
            val paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 1)
            assertThat(paginationHelper.itemCount).isEqualTo(5)
        }

        @Test
        fun shouldCalculateItemsForOtherCollections() {
            val paginationHelper = PaginationHelper(listOf('A', 'B', 'C', 'D', 'E', 'F'), 1)
            assertThat(paginationHelper.itemCount).isEqualTo(6)
        }
    }

    @Nested
    inner class PageCountTest {

        @Test
        fun shouldCalculatePageCountForFiveItemsPerPage() {
            val paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 5)
            assertThat(paginationHelper.pageCount).isEqualTo(1)
        }

        @Test
        fun shouldCalculatePageCountForThreeItemsPerPage() {
            val paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 3)
            assertThat(paginationHelper.pageCount).isEqualTo(2)
        }

        @Test
        fun shouldCalculatePageCountForTwoItemsPerPage() {
            val paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 2)
            assertThat(paginationHelper.pageCount).isEqualTo(3)
        }

        @Test
        fun shouldCalculatePageCountForOneItemPerPage() {
            val paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 1)
            assertThat(paginationHelper.pageCount).isEqualTo(5)
        }
    }

    @Nested
    inner class PageItemCountTest {

        @Nested
        internal inner class WhenFiveItemsPerPageTest {

            private var paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 5)

            @BeforeEach
            fun setUp() {
                paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 5)
            }

            @Test
            fun shouldCalculatePageItemCountAtStartPage() {
                assertThat(paginationHelper.pageItemCount(0)).isEqualTo(5)
            }

            @Test
            fun shouldCalculatePageItemCountAtSecondPage() {
                assertThat(paginationHelper.pageItemCount(1)).isEqualTo(-1)
            }
        }

        @Nested
        internal inner class WhenThreeItemsPerPageTest {
            var paginationHelper: PaginationHelper<Int>? = null

            @BeforeEach
            fun setUp() {
                paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 3)
            }

            @Test
            fun shouldCalculatePageItemCountAtStartPage() {
                assertThat(paginationHelper!!.pageItemCount(0)).isEqualTo(3)
            }

            @Test
            fun shouldCalculatePageItemCountAtSecondPage() {
                assertThat(paginationHelper!!.pageItemCount(1)).isEqualTo(2)
            }
        }
    }

    @Nested
    inner class PageIndexCountTest {

        @Nested
        inner class WhenFiveItemsPerPageTest {
            var paginationHelper: PaginationHelper<Int>? = null

            @BeforeEach
            fun setUp() {
                paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 5)
            }

            @Test
            fun shouldCalculatePageIndexAtStartPage() {
                assertThat(paginationHelper!!.pageIndex(0)).isEqualTo(0)
            }

            @Test
            fun shouldCalculatePageIndexAtSecondPage() {
                assertThat(paginationHelper!!.pageIndex(3)).isEqualTo(0)
            }
        }

        @Nested
        inner class WhenTwoItemsPerPageTest {
            var paginationHelper: PaginationHelper<Int>? = null

            @BeforeEach
            fun setUp() {
                paginationHelper = PaginationHelper(listOf(1, 2, 3, 4, 5), 2)
            }

            @Test
            fun shouldCalculatePageItemCountAtStartPage() {
                assertThat(paginationHelper!!.pageIndex(3)).isEqualTo(1)
            }

            @Test
            fun shouldCalculatePageItemCountAtSecondPage() {
                assertThat(paginationHelper!!.pageIndex(8)).isEqualTo(-1)
            }
        }
    }
}
