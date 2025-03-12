package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CollectionTest {
    @Test
    fun `Same Instance1`() {
        val intList: MutableList<Int> = mutableListOf(1, 2, 3)
        val intMutableList: List<Int> = intList

        assertThat(intMutableList.size).isEqualTo(3)

        intList.add(4)

        assertThat(intMutableList.size).isEqualTo(4)
    }

    @Test
    fun `Same Instance2`() {
        val intList: List<Int> = listOf(1, 2, 3)
        val intMutableList: MutableList<Int> = intList as MutableList<Int>

        assertThat(intMutableList.size).isEqualTo(3)

        intList.add(4)

        assertThat(intMutableList.size).isEqualTo(4)
    }
}
