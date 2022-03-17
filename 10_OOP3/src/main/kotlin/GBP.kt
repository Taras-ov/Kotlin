class GBP(override val currencyCode: String = "GBP") : CurrencyConverter {
    override fun convertToRub(numberOfRubles: Double) {
        val rate = 0.0098
        println("$numberOfRubles RUB = ${rate * numberOfRubles} $currencyCode")
    }
}