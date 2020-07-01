package solutions

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