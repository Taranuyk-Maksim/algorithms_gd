package solutions

import java.io.File
import java.math.BigInteger


fun main(args: Array<String>) {
    val a = A()
    a.run(a.readFile("a.txt"))
}

class A {

    fun run(arr: ArrayList<String>) {
        createFile("src/outputs/out_a.txt", calculator(arr))
    }

    private fun createFile(path: String, i: Int) {
        File(path).writeText(i.toString())
    }

    private fun calculator(arr: ArrayList<String>): Int {
        var counter = 0
        for (i in arr) {
            if (i.toInt() != 0) {
                if (isPrime(i.toInt()) && i.toInt() > 1) {
                    counter++
                }
            } else {
                return counter
            }
        }
        return counter
    }

    private fun isPrime(x: Int): Boolean {
        val bg: BigInteger = BigInteger.valueOf(x.toLong())
        return bg.isProbablePrime(x)
    }

    fun readFile(fileName: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        File("src/tests/$fileName").forEachLine {
            list.add(it)
        }
        return list


    }
}