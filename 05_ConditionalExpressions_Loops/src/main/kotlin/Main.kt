fun main() {
    println("Введите номер ряда Фибоначчи")
    var n = readLine()!!.toInt()
    while (n <= 0) {
        println("Введите число больше нуля")
        n = readLine()!!.toInt()
    }
    println(fibonacciResult(n))
}
/*
fun fibonacciResult(n: Int): Int {
    if (n == 1) return 0
    if (n == 2) return 1
    return fibonacciResult(n - 2) + fibonacciResult(n - 1)
}
 */

fun fibonacciResult(n: Int): Int {
    if (n == 1) return 0

    var i = 3
    var f1 = 0
    var f2 = 1

    while (i <= n) {
        val sum = f1 + f2
        f1 = f2
        f2 = sum

        i++
    }
    return f2
}