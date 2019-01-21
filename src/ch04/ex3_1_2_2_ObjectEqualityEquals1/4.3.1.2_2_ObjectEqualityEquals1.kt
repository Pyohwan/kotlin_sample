package ch04.ex3_1_2_2_ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean { // Any는 자바의 java.lang.Object 대응. null 가능
        if (other == null || other !is Client)
            return false
        return name == other.name &&
               postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    //override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562))) // 왜 false 일까?

    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2) // 코틀린에서 == 는 자바의 equals 와 같음. 레퍼런스 비교 할려면 === 해야 함
}
