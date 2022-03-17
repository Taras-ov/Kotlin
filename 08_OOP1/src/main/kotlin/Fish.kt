import kotlin.random.Random
import kotlin.random.nextInt

class Fish(
    energyArg: Int,
    weightArg: Int,
    maxAgeArg: Int = 10,
    nameArg: String = "Рыба"
) : Animal(energyArg, weightArg, maxAgeArg, nameArg) {

    override fun movement() {
        super.movement()
        println("плывёт")
    }

    override fun procreate(): Animal {
        val newAnimal =  Fish(
            Random.nextInt(1..10),
            Random.nextInt(1..5),
            maxAge,
            name
        )
        println("Рождено новое животное ${newAnimal.name}! " +
                "Вес - ${newAnimal.weight}, " +
                "энергия - ${newAnimal.energy} " +
                "максимальный возраст - ${newAnimal.maxAge}")
        return newAnimal
    }
}