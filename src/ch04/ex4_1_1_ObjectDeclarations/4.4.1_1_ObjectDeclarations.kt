package ch04.ex4_1_1_ObjectDeclarations

import java.util.Comparator
import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> { // 클래스를 상속한 object
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path,
                ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(
        File("/User"), File("/user")))
    val files = listOf(File("/Z"), File("/a"))

    println(files.sortedWith(CaseInsensitiveFileComparator)) // 일반 객체(클래스)를 사용하는 곳에 싱글턴 넣을 수 있음
}
