package de.prosoz.kata.adventofcode

import junit.framework.TestCase
import org.junit.Test

class Day1KtTest : TestCase() {

    private val input = listOf(
        1721,
        979,
        366,
        299,
        675,
        1456
    )

    @Test
    fun testDay1_1() {
        assertEquals(514579, productOfDay1_1(input))
    }

    @Test
    fun testDay1_2() {
        assertEquals(241861950, productOfDay1_2(input))
    }
}