import kotlin.random.Random
import kotlin.random.nextInt

class Dog(
    energyArg: Int,
    weightArg: Int,
    maxAgeArg: Int = 20,
    nameArg: String = "Собака"
) : Animal(energyArg, weightArg, maxAgeArg, nameArg) {

    override fun movement() {
        super.movement()
        println("бежит")
    }

    override fun procreate(): Animal {
        val newAnimal =  Dog(
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