package solutions.primes

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val c = С()
    c.run("c.txt", "out_c.txt")
}

class С {

    fun run(inp: String, out: String) {
        createFile(out, getSimpleTwoNumbers(readFile(inp)))
    }

    private fun getSimpleTwoNumbers(arr: ArrayList<String>): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        for (i in 0..arr[0].toInt()) {
            if (i <= arr[0].toInt()) {
                if (isPrimeNumber(i) && i > 1) {
                    list.add(i.toString())
                }
            } else {
                return list
            }
        }
        return list
    }
}