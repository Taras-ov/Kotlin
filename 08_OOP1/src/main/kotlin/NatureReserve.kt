class NatureReserve (
    private var animals: List<Animal> = listOf<Animal>()
) {
    private val bird1 = Bird(5, 4)
    private val bird2 = Bird(3, 6)
    private val bird3 = Bird(8, 5)
    private val bird4 = Bird(10, 7)
    private val bird5 = Bird(9, 10)

    private val fish1 = Fish(4, 11)
    private val fish2 = Fish(16, 6)
    private val fish3 = Fish(12, 3)

    private val dog1 = Dog(12, 14)
    private val dog2 = Dog(11, 15)

    private val commonAnimal1 = Animal()
    private val commonAnimal2 = Animal()

    init {
        animals = listOf(
            bird1,
            bird2,
            bird3,
            bird4,
            bird5,
            fish1,
            fish2,
            fish3,
            dog1,
            dog2,
            commonAnimal1,
            commonAnimal2
        )
        println(animals)
    }

    fun lifeCycle() {
        val newList = mutableListOf<Animal>()
        newList.addAll(animals)
        var i = 0
        while (i < 10) {
            animals.forEach {
                when((1..4).random()) {
                    1 -> {
                    val newAnimal = it.procreate()
                    newList.add(newAnimal)
                    }
                    2 -> it.sleep()
                    3 -> it.movement()
                    4 -> it.eat()
                }
            }
            i++
        }
        newList.removeAll(newList.filter { it.isTooOld })
        if (newList.size <= 0) println("Все животные скоропостижнулись:(")
        else println("Животных в заповеднике: ${newList.size}")
    }
}