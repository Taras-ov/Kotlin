class Battle(
    private var firstTeam: List<AbstractWarrior>,
    private var secondTeam: List<AbstractWarrior>
) {
    val theBattleIsOver get(): Boolean = firstTeam.isEmpty() || secondTeam.isEmpty()
    fun getCurrentCondition() {
        if (firstTeam.isNotEmpty() && secondTeam.isNotEmpty()) println(BattleState.Progress.condition)
        if (firstTeam.isEmpty() && secondTeam.isEmpty()) println(BattleState.Draw.condition)
        if (firstTeam.isNotEmpty() && secondTeam.isEmpty()) println(BattleState.FirstTeamWin.condition)
        if (firstTeam.isEmpty() && secondTeam.isNotEmpty()) println(BattleState.SecondTeamWin.condition)
    }

    fun iterateTheBattle() {
        firstTeam.forEach {
            it.attack(secondTeam.random())
        }
        secondTeam = secondTeam.filter { !it.isKilled }
        println("Воинов у второй команды: ${secondTeam.size}")

        secondTeam.forEach {
            it.attack(firstTeam.random())
        }
        firstTeam = firstTeam.filter { !it.isKilled }
        println("Воинов у первой команды: ${firstTeam.size}")
    }
}