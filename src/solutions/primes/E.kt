package solutions.primes

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val e = E()
    e.run("e.txt", "out_e.txt")
}

class E {

    fun run(input: String, output: String) {
        createFile(output, getNOD(readFile(input)))
    }

    private fun getNOD(arr: ArrayList<String>): String {
        return nod(arr[0].toInt(), arr[1].toInt()).toString()
    }
}