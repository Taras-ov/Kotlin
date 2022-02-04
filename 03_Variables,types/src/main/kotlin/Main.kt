fun main() {
    val firstName: String = "Вячеслав"
    val lastName: String = "Тарасов"
    var height: Double = 1.78
    val weight: Float = 80f
    var isChild = height < 1.5 || weight < 40f
    var info = """Имя: $firstName
        |Фамилия: $lastName
        |Рост: $height
        |Вес: $weight
        |Ребёнок? - $isChild
    """.trimMargin()

    println(info)

    height = 1.45
    isChild = height < 1.5 || weight < 40f
    info = """|
        |Имя: $firstName
        |Фамилия: $lastName
        |Рост: $height
        |Вес: $weight
        |Ребёнок? - $isChild
    """.trimMargin()

    println(info)

}