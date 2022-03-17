sealed class BattleState(val condition: String) {
    object Progress : BattleState("Битва продолжается")
    object FirstTeamWin : BattleState("Победа первой команды")
    object SecondTeamWin : BattleState("Победа второй команды")
    object Draw : BattleState("Ничья")
}
