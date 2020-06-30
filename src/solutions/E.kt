package solutions

import java.io.File
import java.lang.Math.sqrt
import java.math.BigInteger

fun main(args: Array<String>) {
    val e = E()
    e.run("e.txt","out_e.txt")
}
class E {

    fun run(input : String, output : String) {
        createFile(output, calculator(readFile(input)))
    }

    private fun createFile(name: String, list : String) {
        val f = File("src/outputs/$name")
        f.writeText(list)
    }

    private fun calculator(arr: ArrayList<String>): String {
        return nod(arr[0].toInt(),arr[1].toInt()).toString()
    }

    private fun nod(a_ : Int , b_ : Int) : Int{
        var a = a_
        var b = b_

        while (b !=0) {
            val tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private fun readFile(fileName: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        File("src/tests/$fileName").forEachLine {
            list.add(it)
        }
        return list
    }
}