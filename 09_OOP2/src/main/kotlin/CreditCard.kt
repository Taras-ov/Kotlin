open class CreditCard(override var balance: Double, private val creditLimit: Double) : BankCard() {
    private var creditBalance = creditLimit

    override fun topUp(amount: Double): Double {
        val debt = creditLimit - creditBalance
        if (amount >= debt) {
            balance += (amount - debt)
            creditBalance = creditLimit
        } else
            creditBalance += amount
        return balance
    }

    override fun pay(amount: Double): Boolean {
        val verification = (balance + creditBalance) >= amount
        if (verification) {
            if (balance >= amount) balance -= amount
            else {
                creditBalance -= amount - balance
                balance = 0.0 }
        } else
            println("Недостаточно средств")
        return verification
    }

    override  fun availableFundsInfo() {
        println("""Доступные средства:
            |Кредитный лимит: $creditLimit
            |Кредитные средства: $creditBalance
            |Собственные средства: $balance
            |Всего доступно средств: ${balance + creditBalance}
            |""".trimMargin())
    }
}