package solutions.primes

import java.io.File
import java.math.BigInteger

fun isPrimeNumber(x: Int): Boolean {
    val bg: BigInteger = BigInteger.valueOf(x.toLong())
    return bg.isProbablePrime(x)
}

fun nod(v1: Int, v2: Int): Int {
    var a = v1
    var b = v2
    while (b != 0) {
        val tmp = a % b
        a = b
        b = tmp
    }
    return a
}

fun readFile(fileName: String): ArrayList<String> {
    val list: ArrayList<String> = ArrayList()
    File("src/tests/$fileName").forEachLine {
        list.add(it)
    }
    return list
}

fun createFile(name: String, list: String) {
    val f = File("src/outputs/$name")
    f.writeText(list)
}

fun createFile(path: String, i: Int) {
    File(path).writeText(i.toString())
}

fun createFile(name: String, list: ArrayList<String>) {
    val f = File("src/outputs/$name")
    f.writeText(list.toString())
}

fun createFileAndAppendText(name: String, list: List<Int>, typeSort : String) {
    val f = File("src/outputs/$name")
    f.appendText(typeSort)
    f.appendText("\n")
    f.appendText(list.toString())
    f.appendText("\n")
    f.appendText(" ")
    f.appendText("\n")
}
fun createFile(name: String, list: List<Int>) {
    val f = File("src/outputs/$name")
    f.writeText("\n" + list.toString())
}

