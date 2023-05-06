package ch02.TryCatch
fun main(args: Array<String>) {
    val percentage = 200
    if(percentage !in 0..100) {
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: ${percentage}"
        )
    }
}