package Task4

class Address {
    var Country: String? = ""
    var City: String? = ""
    var Zipcode: String? = ""
    var Street: String? = ""
    var NumberoftheHouse: Int? = null

    fun isAfterHouseNumber(Givennum: Int?): Boolean {
        if (NumberoftheHouse!! > Givennum!!) {
            return true
            println("True")
        }
        else{
            return false
            println("False")
        }
    }
}



fun main() {
    val Dom = Address()
    Dom.NumberoftheHouse = 5

    val Dom1 = Address()
    Dom1.NumberoftheHouse = 4

    Dom.isAfterHouseNumber(Dom1.NumberoftheHouse)

}