import java.util.Scanner
class Person (_first_name : String = "UNKNOWN", _pers_age : Int = 0 ) {
    val firstName =  _first_name.capitalize()
    var age = _pers_age

    init {
        println("My name is $firstName and I am $age")

    }
}

fun main(args: Array<String>) {
    println("Person1 is instantiated")
    val person1 = Person("Jack", 25)
    println("Person2 is instantiated")
    val person2 = Person("Roger")
    println("Person3 is instantiated")
    val person3 = Person()
}