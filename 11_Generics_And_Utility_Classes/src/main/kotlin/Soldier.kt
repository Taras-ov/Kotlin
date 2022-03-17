class Soldier(
    override val maxHealthPoint: Double = 100.0,
    override val accuracy: Int = 50,
    override val weapon: AbstractWeapon = Weapons.createRifle(),
    override var currentHealthPoint: Double = maxHealthPoint,
    override val dodgeChance: Int = 20
) : AbstractWarrior() {
    override val isKilled get(): Boolean = currentHealthPoint <= 0.0
}