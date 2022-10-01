fun getCount(str: String): Int {
    return str.filter(::isVowel).length
}

//fun getCount(str : String) = str.count { it in "aeiou" }

fun isVowel(character: Char): Boolean {
    return "aeiou".contains(character)
}
