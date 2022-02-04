fun main() {
    var n = readLine()!!.toInt()
    while (n <= 0) {
        println("Ошибка ввода: введите число больше нуля")
        n = readLine()!!.toInt()
    }

    val mutableList = telephoneDirectory(n)
    println(mutableList.filter { it.contains("+7") })

    println(mutableList.toSet().size)

    println(mutableList.sumOf {it.length})

    val mutableMap = mutableMapOf<String, String>()
    mutableList.toSet().forEach { phoneNumber ->
        print("Введите имя человека с номером телефона $phoneNumber:")
        mutableMap[phoneNumber] = readLine()!!.toString() }

    mutableMap.forEach { (key, value) -> println("Абонент:$value. Номер телефона: $key") }
}

fun telephoneDirectory (n: Int): MutableList<String> {
    val mutableList = mutableListOf<String>()
    while (mutableList.size < n) {
        mutableList.add(readLine()!!.toString())
    }
    return mutableList
}