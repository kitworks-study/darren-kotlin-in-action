package ch03.JoinToString2

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, ", ", "", ""))
    println(joinToString(list))
    println(joinToString(list, ";"))
    println(joinToString(list, prefix = "#", postfix = "*"))
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    if(collection==null){
        throw IllegalArgumentException("Collection을 입력해주세요.")
    }
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString();
}
