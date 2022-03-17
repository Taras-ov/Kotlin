class Team {
    fun createTeam(teamSize: Int): List<AbstractWarrior> {
        val teamList = mutableListOf<AbstractWarrior>()
        for (i in 1..teamSize) {
            if (10.isChanceComeTrue()) {
                val general = General()
                teamList.add(general)
            } else
                if (20.isChanceComeTrue()) {
                    val sniper = Sniper()
                    teamList.add(sniper)
                } else
                    if (40.isChanceComeTrue()) {
                        val captain = Captain()
                        teamList.add(captain)
                    } else {
                        val soldier = Soldier()
                        teamList.add(soldier)
                    }
        }
        return teamList.toList()
    }
}