class CreditCardWithBonus(
    override var balance: Double,
    private val creditLimit: Double,
) : CreditCard(balance, creditLimit) {
    private var creditBalance = creditLimit
    private var bonusBalance = 0.0

    override fun pay(amount: Double): Boolean {
        bonusBalance += amount * 0.01
        return super.pay(amount)
    }

    override fun availableFundsInfo() {
        println("""Доступные средства:
            |Кредитный лимит: $creditLimit
            |Кредитные средства: $creditBalance
            |Собственные средства: $balance
            |Бонусные средства: $bonusBalance
            |Всего доступно средств: ${balance + creditBalance}
            |""".trimMargin())
    }
}