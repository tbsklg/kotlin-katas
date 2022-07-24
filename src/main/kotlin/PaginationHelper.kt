import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.min

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {

    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int
        get() {
            return collection.size
        }

    /**
     * returns the number of pages
     */
    val pageCount: Int
        get() {
            return ceil(this.itemCount.toDouble() / itemsPerPage.toDouble()).toInt()
        }


    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int {
        if (this.collection.isEmpty() || !this.isValidPageIndex(pageIndex)) return -1

        val remainingItems = this.itemCount - this.itemsPerPage * pageIndex
        return min(remainingItems, this.itemsPerPage)
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        return if (collection.isEmpty() || !isValidItemIndex(itemIndex)) -1
            else floor(itemIndex.toDouble() / itemsPerPage.toDouble()).toInt()
    }

    private fun isValidPageIndex(pageIndex: Int): Boolean {
        return pageIndex >= 0 && pageIndex < this.pageCount
    }

    private fun isValidItemIndex(itemIndex: Int): Boolean {
        return itemIndex >= 0 && itemIndex < this.itemCount
    }
}
