package ch03.LocalFunctionsAndExtensions2

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${id}: empty ${fieldName}")
        }
    }
    validate(name, "Name")
    validate(address, "Address")

    /*디비 저장 로직*/
}

fun saveUser(user: User) {
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
    saveUser(User(2, "김철수", ""))
}