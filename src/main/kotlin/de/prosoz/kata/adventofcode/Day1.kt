package de.prosoz.kata.adventofcode

import java.io.File


fun main() {
    val inputs = File("src/main/resources/advent-of-code-input-day-1.txt")
        .readLines()
        .map { it.toInt() }

    val output = productOfDay1(inputs)
    print(output)
}

fun productOfDay1(inputs: List<Int>): Int? {
    inputs.forEach { i ->
        inputs.forEach { j ->
            if (i + j == 2020) {
                return i * j
            }
        }
    }
    return null
}
