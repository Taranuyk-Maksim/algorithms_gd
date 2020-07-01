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

fun getListIntNumbers(str: String): ArrayList<Int> {

    val numbers = arrayListOf<Int>()
    val buf = StringBuilder()
    val chars = str.toCharArray()

    for (i in 0..str.length) {
        try {
            val ch = chars[i].toString()
            if (ch !=" ") {
                buf.append(ch)
            }else {
                numbers.add(buf.toString().toInt())
                buf.clear()
            }
        } catch (ex: ArrayIndexOutOfBoundsException) {
            numbers.add(buf.toString().toInt())
        }
    }
    return numbers
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
fun createFile(name: String, list: List<Int>) {
    val f = File("src/outputs/$name")
    f.writeText(list.toString())
}

fun quickSort(items: List<Int>): List<Int> {
    if (items.count() < 2) {
        return items
    }
    val pivot = items[items.count() / 2]

    val equal = items.filter { it == pivot }

    val less = items.filter { it < pivot }

    val greater = items.filter { it > pivot }

    return quickSort(less) + equal + quickSort(greater)
}