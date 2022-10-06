package com.codewars.apartridge

object CodewarsLeaderboardClimber {

    fun leaderBoard(user:String, userScore:Int, yourScore:Int):String {
        if (yourScore > userScore) return "Winning!"
        if (yourScore == userScore) return "Only need one!"

        val scoreDifference = userScore - yourScore

        val betaKata = scoreDifference.div(3)
        val eightKyu = scoreDifference.mod(betaKata)

        val answer = "To beat $user's score, I must complete $betaKata Beta kata and $eightKyu 8kyu kata."

        if (betaKata + eightKyu > 1000) {
            return "$answer Dammit!"
        }

        return answer
    }
}
