fun main() {
    val box1 = TV(
        "LG",
        "m100",
        60.5
    )
    println("Настройка каналов для первого телевизора:")
    println(box1.listOfChannels)
    println("Информация о первом телевизоре:")
    println("Бренд:${box1.brand}")
    println("Модель:${box1.model}")
    println("Размер диагонали:${box1.diagonalSize}")

    box1.turnOnTv()
    box1.turnOffTv()
    box1.increaseVolume(150.0)
    box1.decreaseVolume(120.0)
    box1.increaseVolume(75.0)
    box1.decreaseVolume(33.0)

    box1.switchingChannel(21)
    box1.switchingChannel(0)
    box1.switchingChannel(1)

    for (j in 0..25) {
        box1.channelUp()
    }
    for (j in 0..25) {
        box1.channelDown()
    }

    box1.channelUp()
    Thread.sleep(1000)
    box1.channelUp()

    println()
    val box2 = TV(
        "Samsung",
        "w12",
        90.5
    )
    println("Настройка каналов для второго телевизора:")
    println(box2.listOfChannels)
    println("Информация о втором телевизоре:")
    println("Бренд:${box2.brand}")
    println("Модель:${box2.model}")
    println("Размер диагонали:${box2.diagonalSize}")

    box2.turnOnTv()
    box2.turnOffTv()
    box2.increaseVolume(150.0)
    box2.decreaseVolume(120.0)
    box2.increaseVolume(75.0)
    box2.decreaseVolume(33.0)

    box1.switchingChannel(8)
    box1.switchingChannel(0)
    box1.switchingChannel(28)

    for (j in 0..25) {
        box2.channelUp()
    }
    for (j in 0..25) {
        box2.channelDown()
    }

    box2.channelDown()
    Thread.sleep(1000)
    box2.channelDown()
}
