
fun main() {
    val cypher = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalfOfCypher = cypher.substring(0, 12)
    val secondHalfOfCypher = cypher.substring(12)

    println(decryption1(firstHalfOfCypher) + decryption2(secondHalfOfCypher))
}

fun decryption1(firstHalfOfCypher: String): String {
    val shiftedString = firstHalfOfCypher.map { char -> char + 1 }.joinToString("")
    val symbolReplacement = shiftedString.replace('4', 'u')
    val shiftedString2 = symbolReplacement.map { char -> char - 3 }.joinToString("")
    return shiftedString2.replace('0', 'o')
}

fun decryption2(secondHalfOfCypher: String): String {
    val reversedString = secondHalfOfCypher.reversed()
    val shiftedString = reversedString.map{char -> char - 4}.joinToString("")
    return shiftedString.replace('_', ' ')
}
