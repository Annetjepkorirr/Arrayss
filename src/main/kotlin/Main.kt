fun main() {
    name()
    places()
    property()
    friends()
}
fun name(){
    var people = arrayOf("Eunice","Annet","Amara","Nana")
    println(people.contentToString())
}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{cities-> println(cities.capitalize())}
//    println(cities)
}
fun property(){
    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,63)
    var sum = (number[1]+number[4])
    println(sum)
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())

}
fun friends(){
    var names = arrayOf("Julie","Faith","Amanda",)
    println(names.contentToString())
}