import java.util.Scanner
class Person (val first_name : String, var age : Int ) {

}

fun main(args: Array<String>) {
val pers = Person("Prince", 36)

    print("My name is ${pers.first_name} and I am ${pers.age}")
}