package solutions.primes

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val h = H()
    h.run("h.txt", "out_h.txt")
}

class H {

    fun run(input: String, output: String) {
        createFile(output, getHodOfPrimeNumbers(readFile(input)))
    }

    private fun getHodOfPrimeNumbers(arr: ArrayList<String>): String {
        var nod = nod(arr[0].toInt(), arr[1].toInt())
        for (i in arr) {
            nod = nod(nod, i.toInt())
        }
        return nod.toString()
    }
}