class Wheel {
    private var currentPressure: Double = 0.0

    fun pumpUp(definiteValue: Double) {
        if (definiteValue in (0.0..10.0)) currentPressure = definiteValue
        else throw IncorrectPressure()
    }

    fun checkPressure() {
        if (currentPressure in (0.0..1.5)) throw TooLowPressure()
        else if (currentPressure in (2.6..10.0)) throw TooHighPressure()
        else if (currentPressure > 10.0 || currentPressure < 0.0) throw IncorrectPressure()
        else println("Давление в колесе: $currentPressure")
    }
}