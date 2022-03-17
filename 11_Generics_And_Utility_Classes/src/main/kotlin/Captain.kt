class Captain(
    override val maxHealthPoint: Double = 150.0,
    override val accuracy: Int = 60,
    override val weapon: AbstractWeapon = Weapons.createAssaultRifle(),
    override var currentHealthPoint: Double = maxHealthPoint,
    override val dodgeChance: Int = 30
) : AbstractWarrior() {
    override val isKilled get(): Boolean = currentHealthPoint <= 0.0
}