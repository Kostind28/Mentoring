package Task3

fun main() {

    var words = listOf<String>("Apple", "Banana", "Pear", "Orange", "Pineapple")
    var playword = words.random().uppercase()

    println("Game started!")
    println("Wright any letter to start: ")
    var userguess = readLine()?.uppercase()
    val playwordlength = playword.length
    println(playwordlength)

    val fieldsegment = "_"
    var field = fieldsegment.repeat(playwordlength)

    val result = field.toCharArray()

    var gamestatment = false

    var charnum = 0
    println(field)

    while (gamestatment == false){
        userguess = readLine()?.uppercase()

        if (charnum >= playwordlength){
            println("You win!")
            break
        }
        if (userguess == playword[charnum].toString()){
            result[charnum] = userguess.first()
            field = String(result)
            println(field)
            charnum++
        }
        else {
            println("$field, try again")
        }
    }
println("Game over")
}