fun main (){

    val person = Person("Kimberly",200)
    println(person.first_name + person.last_name)
    println(person.first_name + person.number + "is ${person.adj}" + "because ${person.personality}")

}
class Person(name: String, lek: Int) {
    val first_name : String = "Chansovanmony "
    val last_name: String = name
    val personality : String = "She's Capable and Brave."
    val adj: String = ", no fear"
    val number: Int = lek

}