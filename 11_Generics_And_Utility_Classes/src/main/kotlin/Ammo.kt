enum class Ammo(private val damage: Int, private val criticalChance: Int, private val criticalRate: Double) {
    SPRINGFIELD(80, 25, 1.5),
    WINCHESTER(90, 70, 1.2),
    PARABELLUM(70, 50,2.0);

    fun getCurrentDamage(): Double {
        return if (criticalChance.isChanceComeTrue()) (damage * criticalRate)
        else
            damage.toDouble()
    }
}