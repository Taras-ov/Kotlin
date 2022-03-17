abstract class AbstractWarrior : Warrior {
    abstract val maxHealthPoint: Double
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealthPoint: Double

    override fun attack(enemy: Warrior) {
        if (weapon.isCartridgeClipEmpty) weapon.recharge()
        else
            weapon.getCartridgeForShot().forEach {
                if (accuracy.isChanceComeTrue() && !enemy.dodgeChance.isChanceComeTrue()) {
                    enemy.takeDamage(it.getCurrentDamage())
                }
            }
    }

    override fun takeDamage(numberOfDamage: Double) {
        currentHealthPoint -= numberOfDamage
    }
}