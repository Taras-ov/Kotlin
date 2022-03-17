abstract class BankCard {
    abstract var balance: Double

    open fun topUp(amount: Double): Double {
        balance += amount
        return balance
    }

    open fun pay(amount: Double): Boolean {
        val verification = balance >= amount
        if (verification) balance -= amount
        else
            println("Недостаточно средств")
        return verification
    }

    open fun balanceInfo() {
        println("Ваш баланс: $balance")
    }

    open fun availableFundsInfo() {
        println("Доступные средства: $balance")
    }
}