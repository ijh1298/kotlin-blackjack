package study

val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)

fun List<Int>.sumOf(condition: () -> Boolean): Int {
    var total = 0
    for (number in numbers) {
        if (condition()) { // condition() == condition.invoke()
            total += number
        }
    }
    return total
}

fun sumAll(numbers: List<Int>): Int {
    var total = 0

    for (number in numbers) {
        total += number
    }

    return total
}

fun sumAllEven(numbers: List<Int>): Int {
    var total = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            total += number
        }
    }
    return total
}

fun sumAllOverThree(numbers: List<Int>): Int {
    var total = 0
    for (number in numbers) {
        if (number > 3) {
            total += number
        }
    }
    return total
}
