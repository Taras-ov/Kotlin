class Sniper(
    override val maxHealthPoint: Double = 120.0,
    override val accuracy: Int = 95,
    override val weapon: AbstractWeapon = Weapons.createSniperRifle(),
    override var currentHealthPoint: Double = maxHealthPoint,
    override val dodgeChance: Int = 60
) : AbstractWarrior() {
    override val isKilled get(): Boolean = currentHealthPoint <= 0.0
}