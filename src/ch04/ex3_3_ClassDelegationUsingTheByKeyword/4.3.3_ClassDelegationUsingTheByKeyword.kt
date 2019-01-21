package ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

data class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { // MutableCollection의 구현을 innerSet 에게 위임한다.

    var objectsAdded = 0

    override fun add(element: T): Boolean { // 새로 구현
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean { // 새로 구현
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
    cset.addAll(listOf(3))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain. ${cset}")
}
