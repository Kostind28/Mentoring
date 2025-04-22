import kotlin.toString

fun main() {
    val code = mapOf (
        "A" to "· –",
        "B" to "– · · ·",
        "C" to "– · – ·",
        "D"	to "– · ·",
        "E"	to "·",
        "F"	to "· · – ·",
        "G" to "– – ·",
        "H"	to "· · · ·",
        "I"	to "· ·",
        "J"	to "· – – –",
        "K"	to "– · –",
        "L"	to "· – · ·",
        "M"	to "– –",
        "N"	to "– ·",
        "O"	to "– – –"	,
        "P"	to "· – – ·",
        "Q"	to "– – · –",
        "R"	to "· – ·",
        "S"	to "· · ·",
        "T" to "–",
        "U"	to "· · –",
        "V"	to "· · · –",
        "W"	to "· – –",
        "X"	to "– · · –",
        'Y'	to "– · – –",
        "Z"	to "– – · ·",
    )

    println("Do you want to encode (type 'e') or decode (type 'd') from/to morse code?")
    val ui = readLine()

    if (ui == "e") {
        println("Running encode...")
        Icode()
    } else if (ui == "d") {
        println("Running decode...")
        Dcode()
    } else {
        println("Fail, try again.")
    }

}

fun Icode() {
    val code = mapOf (
        "A" to "·–",
        "B" to "–···",
        "C" to "–·–·",
        "D"	to "–··",
        "E"	to "·",
        "F"	to "··–·",
        "G" to "––·",
        "H"	to "····",
        "I"	to "··",
        "J"	to "·–––",
        "K"	to "–·–",
        "L"	to "·–··",
        "M"	to "––",
        "N"	to "–·",
        "O"	to "–––",
        "P"	to "·––·",
        "Q"	to "––·–",
        "R"	to "·–·",
        "S"	to "···",
        "T" to "–",
        "U"	to "··–",
        "V"	to "···–",
        "W"	to "·––",
        "X"	to "–··–",
        'Y'	to "–·––",
        "Z"	to "––··",
    )

    println("Enter the word")
    var word = readLine()?.uppercase()

    var morse = mutableListOf<String>()

    var wordl = word?.map { it.toString()}

    for (char in wordl!!) {
        val mc = code[char]
        morse.add(mc.toString())
    }

    var result = morse.joinToString(" ")
    println("The word $word in morse code is $result")
}

fun Dcode() {
    val code = mapOf (
        "·–" to "A",
        "–···" to "B",
        "–·–·" to "C",
        "–··" to "D",
        "·" to "E",
        "··–·" to "F",
        "––·" to "G",
        "····" to "H",
        "··" to "I",
        "·–––" to "J",
        "–·–" to "K",
        "·–··" to "L",
        "––" to "M",
        "–·" to "N",
        "–––" to "O",
        "·––·" to "P",
        "––·–" to "Q",
        "·–·" to "R",
        "···" to "S",
        "–" to "T",
        "··–" to "U",
        "···–" to "V",
        "·––" to "W",
        "–··–" to "X",
        "–·––" to "Y",
        "––··" to "Z"
    )
    println("Enter the code")
    var cword = readLine()

    var dmorse = mutableListOf<String>()

    var morsel = cword?.split(" ")

    for (char in morsel!!) {
        val mc = code[char]
        dmorse.add(mc.toString())
    }
    var result = dmorse.joinToString("")
    println("The code $cword is the word $result")
}