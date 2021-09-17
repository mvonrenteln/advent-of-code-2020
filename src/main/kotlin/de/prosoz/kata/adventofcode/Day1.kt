package de.prosoz.kata.adventofcode

import java.io.File


fun main() {
    val inputs = File("src/main/resources/advent-of-code-input-day-1.txt")
        .readLines()
        .map { it.toInt() }

    val output = productOfDay1_2(inputs)
    println(output)
}

fun productOfDay1_1(inputs: List<Int>): Int? {
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
    val indices = inputs.indices

    for (i in indices) {
        for (j in i + 1 until inputs.size) {
            for (k in j + 1 until inputs.size) {
                durchläufe++
                if (inputs[i] + inputs[j] + inputs[k] == 2020) {
                    println("Durchläufe: $durchläufe")
                    return inputs[i] * inputs[j] * inputs[k]
                }
            }
        }
    }

    return null
}
