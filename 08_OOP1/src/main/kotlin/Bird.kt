import kotlin.random.Random
import kotlin.random.nextInt

class Bird(
    energyArg: Int,
    weightArg: Int,
    maxAgeArg: Int = 30,
    nameArg: String = "Птица"
) : Animal(energyArg, weightArg, maxAgeArg, nameArg) {

    override fun movement() {
        super.movement()
        println("летит")
    }

    override fun procreate(): Animal {
        val newAnimal =  Bird(
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