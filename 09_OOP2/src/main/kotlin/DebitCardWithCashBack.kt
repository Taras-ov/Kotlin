class DebitCardWithCashBack(override var balance: Double) : DebitCard(balance) {
    override fun pay(amount: Double): Boolean {
        if (amount >= 5000) balance += (amount * 0.05)
        return super.pay(amount)
    }
}