fun main() {
    val testWheel = Wheel()

    testWheel.pumpUp(2.0)
    testWheel.checkPressure()

    try {
        testWheel.pumpUp(-5.0)
    }
    catch (e: IncorrectPressure) {
        println("Процедура не удалась")
    }
    testWheel.checkPressure()

    testWheel.pumpUp(6.0)
    try {
        testWheel.checkPressure()
    }
    catch (e: TooHighPressure) {
        println("Процедура удалась. Эксплуатация невозможна - давление превышает нормальное")
    }
}