package ch04.ex3_1_2_1_ObjectEqualityEquals

class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2) // 코틀린에서 == 는 자바의 equals 와 같음. 레퍼런스 비교 할려면 === 해야 함
}
