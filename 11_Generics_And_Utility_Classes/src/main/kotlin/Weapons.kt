object Weapons {
    fun createPistol(): AbstractWeapon {
        val pistol = object : AbstractWeapon
            (6, FireType.SingleShot, Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.PARABELLUM
            }
        }
        return pistol
    }

    fun createRifle(): AbstractWeapon {
        val rifle = object : AbstractWeapon
            (9, FireType.SingleShot, Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.WINCHESTER
            }
        }
        return rifle
    }

    fun createAssaultRifle(): AbstractWeapon {
        val assaultRifle = object : AbstractWeapon
            (30, FireType.BurstFire(3), Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.SPRINGFIELD
            }
        }
        return assaultRifle
    }

    fun createSniperRifle(): AbstractWeapon {
        val sniperRifle = object : AbstractWeapon
            (12, FireType.SingleShot, Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.WINCHESTER
            }
        }
        return sniperRifle
    }
}