interface CurrencyConverter {
    val currencyCode: String

    fun convertToRub(numberOfRubles: Double)
}