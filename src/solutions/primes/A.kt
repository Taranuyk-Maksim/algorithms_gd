package solutions.primes

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val a = A()
    a.run("a.txt", "out_a.txt")
}

class A {

    fun run(inp: String, out: String) {
        createFile(out, getPrimeNumbersCount(readFile(inp)))
    }

    private fun getPrimeNumbersCount(arr: ArrayList<String>): Int {
        var counter = 0
        for (i in arr) {
            if (i.toInt() != 0) {
                if (isPrimeNumber(i.toInt()) && i.toInt() > 1) {
                    counter++
                }
            } else {
                return counter
            }
        }
        return counter
    }

}