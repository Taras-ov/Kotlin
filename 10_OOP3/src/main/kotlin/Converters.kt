object Converters {
    private val listOfConverters = listOf(USD(), EUR(), GBP())

    fun get(currencyCode: String): CurrencyConverter {
        val result = listOfConverters.find { it.currencyCode == currencyCode.uppercase() }
        return if (result == null) {
            object : CurrencyConverter {
                override val currencyCode = String()
                override fun convertToRub(numberOfRubles: Double) {
                    println("Неизвестный код валюты, введите курс рубля к данной валюте:")
                    var rate = readLine()?.toDoubleOrNull() ?: 0.0
                    while (rate <= 0.0) {
                        println("Повторите ввод:")
                        rate = readLine()?.toDoubleOrNull() ?: 0.0
                    }
                    println("$numberOfRubles RUB = ${rate * numberOfRubles} $currencyCode")
                }
            }
        } else return result
    }
}