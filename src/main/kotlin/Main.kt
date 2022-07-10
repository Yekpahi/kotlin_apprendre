import java.util.Scanner
fun main(args: Array<String>) {
    /*val tens1 : String = "Je m'appelle "
    val nom : String = "Marc, j'ai  "
    val age : Int = 13
    val tens2 : String = " ans."
    val result = tens1 + nom + age + tens2
    println(result)
     */

    /*var num = 12
    num *=10
    println("num * 10 = $num")
     */

    /*val x = 12
    val y = 65
    val z = if (x>y) {
        val result = x - y
        println("x - y = $result")
    } else {
        val result = y - x
        println("y - x = $result")
    }
    print(z)
     */
    /*
    val num = intArrayOf(10, 30, 54, -40)
    if(10 in num) {
        println(num[0])
    }
    num[1] = 45
    print(num[1] )
     */

    /*
    val score : Int
    score = 90 + 25
    println(" score = $score")
     */

   /* val a = 19
    val b = 13
    val max : Int
    max = if (a>b) a - b  else b - a
    print("$max")
    */
// input
   /* print("Entrer votre texte: ")

    val stringInput = readLine()!!
    print("Ton texte est : $stringInput")
    */

    /*
    val reader = Scanner(System.`in`)
    print("Entrer un chiffre :  ")

    var integer : Int = reader.nextInt()

    println("You entered * 10: ${integer*10}")
     */
// WHEN STATEMENT

    /*val a = 12
    val b = 5

    println("Enter Operator either +, -, * or / : ")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
     */
    /*val a = 12
    val b = 5

    println("Enter operator either +, -, * or / : ")
    val operator = readLine()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }
*/
    /*
    val reader = Scanner(System.`in`)
    print("Entrer un chiffre :  ")

    var chiffre : Int = reader.nextInt()

    when (chiffre) {
        10, 12, 30-> println("$chiffre is a positive integer less than 4.")
        62,54, 100 -> println("$chiffre is a positive integer less than 1000.")
        else -> println("$chiffre is invalid")
    }
     */
   /* var sum = 0
    var i = 100
    while (i != 5) {
        sum += i
        --i
    }
    print("Sum = $sum")

    */

   /* for (i in 1..5) {
        println(i)
    }
    println(" -------------- ")
    for (i in 5 downTo 1 step 2) println(i)
    println(" -------------- ")
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java", "React", "Oracle" )

    for (item in language) println(item)
    println(" -------------- ")

    for (elm in language.indices) {
        if (elm%2 == 0)
            println(language[elm])
    }*/

    var sum = 0
    var number: Int

    while (true) {
        print("Enter a number: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }

    print("sum = $sum")
}