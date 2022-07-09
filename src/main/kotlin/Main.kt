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

    val num = intArrayOf(10, 30, 54, -40)
    if(10 in num) {
        println(num[0])
    }
    num[1] = 45
    print(num[1] )
}