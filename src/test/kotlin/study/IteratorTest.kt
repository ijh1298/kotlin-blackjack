package study

import org.junit.jupiter.api.Test

class IteratorTest {
    @Test
    fun `Iterator 테스트`() {
        val people = listOf("A", "B", "C", "D")
        val peopleIterator = people.iterator()

        while (peopleIterator.hasNext()) {
            println(peopleIterator.next())
        }
    }
}
