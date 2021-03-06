package solutions.primes

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val g = G()
    g.run("g.txt", "out_g.txt")
}

class G {

    fun run(input: String, output: String) {
        createFile(output, getNodSequenceSfNumbers(readFile(input)))
    }

    private fun getNodSequenceSfNumbers(arr: ArrayList<String>): String {
        var nod = nod(arr[0].toInt(), arr[1].toInt())
        for (i in arr) {
            if (i.toInt() != 0) {
                nod = nod(nod, i.toInt())
            } else {
                return nod.toString()
            }
        }
        return nod.toString()
    }
}