package ch02.MapIterator

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps.put(c, binary)
    }

    for ((letter, binary) in binaryReps) {
        println("${letter} = ${binary}")
    }
}