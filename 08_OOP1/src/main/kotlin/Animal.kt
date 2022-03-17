import kotlin.random.Random
import kotlin.random.nextInt

open class Animal (
    protected var energy: Int = 10,
    protected var weight: Int = 10,
    protected val maxAge: Int = 10,
    protected val name: String = "Животное") {

    private var currentAge = 1
    var isTooOld = currentAge >= maxAge

    open fun sleep() {
        if (!isTooOld) {
            energy += 5
            currentAge += 1
            println("$name спит")
        }
    }

    open fun eat() {
        if (!isTooOld) {
            energy += 3
            weight += 1
            tryIncrementAge()
            println("$name ест")
        }
    }

    open fun movement() {
        if ((!isTooOld) || (energy >= 0) || (weight >= 0)) {
            energy -= 5
            weight -= 1
            tryIncrementAge()
            println("$name передвигается")
        }
    }

    open fun procreate(): Animal {
        val newAnimal =  Animal(
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

    private fun tryIncrementAge(): Int {
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        return  currentAge
    }
}