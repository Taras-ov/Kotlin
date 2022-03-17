import kotlin.random.Random

fun main() {
    val team1 = Team().createTeam(7)
    val team2 = Team().createTeam(7)

    val battle = Battle(team1, team2)
    while (!battle.theBattleIsOver) {
        battle.getCurrentCondition()
        battle.iterateTheBattle()
    }
    battle.getCurrentCondition()
}

fun Int.isChanceComeTrue(): Boolean {
    return Random.nextInt(100) <= this
}




