package study

import kotlinx.coroutines.Runnable
import org.junit.jupiter.api.Test

data class Person(
    val name: String,
    val age: Int,
)

class PersonTest {
    @Test
    fun `People`() {
        val people: List<Person> = listOf()
        val mutableList = mutableListOf<Person>()

        val person = people.maxBy(Person::age)
    }

    @Test
    fun `count와 size`() {
        fun isSeven(value: Int): Boolean = value == 7

        val numbers = listOf(1, 5, 6, 7, 4, 1, 7)

        val filteredSize = numbers.filter(::isSeven).size
        val countedSize = numbers.count(::isSeven)
    }

    @Test
    fun `Runnable`() {
        fun createAllDoneRunnable(): Runnable {
            return Runnable { println("All Done!") }
        }

        createAllDoneRunnable().run()
    }

    @Test
    fun `StringBuilder Test`() {
        val stringBuilder = StringBuilder()
        return with(stringBuilder) {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\n알파벳 끝")
            toString()
        }
    }
}
