fun electionsWinners(votes: Array<Int>, k: Int): Int {
    return when (k) {
        0 -> findWinnerFrom(votes)
        else -> findWinnerFrom(votes, k)
    }
}

private fun findWinnerFrom(votes: Array<Int>, k: Int): Int {
    val maximumVote = votes.maxOrNull()!!

    return votes
        .count { vote -> vote + k > maximumVote }
}

private fun findWinnerFrom(votes: Array<Int>): Int {
    val maximumVote = votes.maxOrNull()!!

    return when (votes.count { vote -> vote == maximumVote }) {
        1 -> 1
        else -> 0
    }
}
