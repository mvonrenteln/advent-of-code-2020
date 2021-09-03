package de.prosoz.kata.adventofcode

import java.io.File


fun main() {
    val inputs = File("src/main/resources/advent-of-code-input-day-1.txt")
        .readLines()
        .map { it.toInt() }

    val output = productOfDay1(inputs)
    print(output)
}

fun productOfDay1(inputs: List<Int>): Int {
    val (i, j) = inputs
        .complement()
        .first { (i, j) -> i + j == 2020 }
    return i * j
}
//365619

fun List<Int>.complement(): List<Pair<Int, Int>> = map { it to 2020 - it}