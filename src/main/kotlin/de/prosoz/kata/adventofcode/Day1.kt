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
    var durchläufe = 0
    val indices = inputs.indices

    for (i in indices) {
        for (j in i + 1 until inputs.size) {
            durchläufe++
            if (inputs[i] + inputs[j] == 2020) {
                println("Durchläufe: $durchläufe")
                return inputs[i] * inputs[j]
            }
        }
    }

    return null
}

fun productOfDay1_2(inputs: List<Int>): Int? {
    var durchläufe = 0
    inputs.forEach { i ->
        inputs.forEach { j ->
            durchläufe++
            if (i + j == 2020) {
                println("Durchläufe: $durchläufe")
                return i * j
            }
        }
    }
    return null
}
