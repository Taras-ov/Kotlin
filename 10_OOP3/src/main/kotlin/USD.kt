class USD(override val currencyCode: String = "USD") : CurrencyConverter {
    override fun convertToRub(numberOfRubles: Double) {
        val rate = 0.013
        println("$numberOfRubles RUB = ${rate * numberOfRubles} $currencyCode")
    }
}