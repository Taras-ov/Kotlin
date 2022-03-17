interface Warrior {
    val isKilled: Boolean
    val dodgeChance: Int

    fun attack(enemy: Warrior)
    fun takeDamage(numberOfDamage: Double)
}