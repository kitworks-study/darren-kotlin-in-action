package ch02.TryAsExpression;

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)

    val reader2 = BufferedReader(StringReader("1"))
    readNumber(reader2)
}

fun readNumber(reader: BufferedReader): Int? {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    return number
}