class TV(
    val brand: String,
    val model: String,
    val diagonalSize: Double) {

    private var tvOn = false
    fun turnOnTv() {
        println("Телевизор включен")
        tvOn = true
    }

    fun turnOffTv() {
        println("Телевизор выключен")
        tvOn = false
    }

    val listOfChannels = Channels.getRandomChannel()

    private var currentChannel = 0

    fun channelUp() {
        if (!tvOn) turnOnTv()
        currentChannel += 1
        val nameOfChannel = listOfChannels[currentChannel - 1]
        println("$currentChannel - $nameOfChannel")
        if (currentChannel == listOfChannels.lastIndex + 1) currentChannel = 0
    }

    fun channelDown() {
        if (!tvOn) turnOnTv()
        if (listOfChannels.indices.contains(currentChannel - 1)) currentChannel -= 1
        else {
            currentChannel = listOfChannels.lastIndex
        }
        val nameOfChannel= listOfChannels[currentChannel]
        println("$currentChannel - $nameOfChannel")
    }

    fun switchingChannel(numberOfChannel: Int) {
        if (!tvOn) turnOnTv()
        currentChannel = numberOfChannel
        if (numberOfChannel > listOfChannels.size) currentChannel = listOfChannels.lastIndex + 1
        if (numberOfChannel < 1) currentChannel = 1
        val nameOfChannel = listOfChannels[currentChannel - 1]
        println("$currentChannel - $nameOfChannel")
    }

    private var currentVolume = 0.0

    fun increaseVolume (volume: Double) {
        currentVolume += volume
        if (currentVolume > maxVolume)
            currentVolume = maxVolume
        println("Громкость:$currentVolume")
    }

    fun decreaseVolume (volume: Double) {
        currentVolume -= volume
        if (currentVolume < 0.0)
            currentVolume = 0.0
        println("Громкость:$currentVolume")
    }

    object Channels {
        private val channelList = listOf(
            "ТНТ",
            "СТС",
            "ТВ-3",
            "ТНТ-4",
            "National geographic",
            "Матч ТВ",
            "РЕН-ТВ",
            "МУЗ-ТВ",
            "НТВ",
            "Пятница",
            "Первый канал",
            "Россия 1",
            "МИР",
            "Россия 24",
            "ОТР",
            "ТВ Центр",
            "Пятый канал",
            "Карусель",
            "Домашний",
            "Спас"
        )
        fun getRandomChannel(): List<String> {
            val randomNumber = (2..channelList.size).random()
            return channelList.shuffled().slice(0..randomNumber)
        }
    }

    private companion object {
        const val maxVolume = 100.0
    }
}
