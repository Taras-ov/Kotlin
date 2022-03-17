abstract class AbstractWeapon(
    private val maxOfCartridgeClip: Int,
    private val fireType: FireType,
    private var cartridgeClip: Stack<Ammo>
    ) {
    val isCartridgeClipEmpty get(): Boolean = cartridgeClip.isEmpty()
    abstract fun createCartridge(): Ammo

    fun recharge() {
        for (i in 1..maxOfCartridgeClip) {
            cartridgeClip.push(createCartridge())
        }
    }

    fun getCartridgeForShot(): List<Ammo> {
        val listOfCartridgesForShot = mutableListOf<Ammo>()
        if (fireType is FireType.BurstFire)
            for (i in 1..fireType.burstSize)
                cartridgeClip.pop()?.let { listOfCartridgesForShot.add(it) }
        else
            cartridgeClip.pop()?.let { listOfCartridgesForShot.add(it) }
        return listOfCartridgesForShot.toList()
    }


}