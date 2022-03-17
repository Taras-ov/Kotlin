class EUR(override val currencyCode: String = "EUR") : CurrencyConverter {
    override fun convertToRub(numberOfRubles: Double) {
        val rate = 0.012
        println("$numberOfRubles RUB = ${rate * numberOfRubles} $currencyCode")
    }
}