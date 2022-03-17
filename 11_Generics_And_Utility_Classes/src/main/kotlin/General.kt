class General(
    override val maxHealthPoint: Double = 200.0,
    override val accuracy: Int = 80,
    override val weapon: AbstractWeapon = Weapons.createPistol(),
    override var currentHealthPoint: Double = maxHealthPoint,
    override val dodgeChance: Int = 10
) : AbstractWarrior() {
    override val isKilled get(): Boolean = currentHealthPoint <= 0.0
}