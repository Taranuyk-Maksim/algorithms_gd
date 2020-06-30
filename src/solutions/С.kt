package solutions

import java.io.File
import java.math.BigInteger

fun main(args: Array<String>) {
    val cc = С()
    cc.run("c.txt","out_c.txt")
}
class С {

    fun run(inp : String, out : String) {
        createFile(out, calculator(readFile(inp)))
    }

    private fun createFile(name: String, list : ArrayList<String>) {
        val f = File("src/outputs/$name")
        f.writeText(list.toString())
    }

    private fun calculator(arr: ArrayList<String>): ArrayList<String> {
        val list : ArrayList<String> = ArrayList()
        for (i in 0..arr[0].toInt()) {
            if (i <= arr[0].toInt()){
                if (isPrime(i) && i > 1) {
                    list.add(i.toString())
                }
            }else{
                return list
            }
        }
        return list
    }

    private fun isPrime(x: Int): Boolean {
        val bg: BigInteger = BigInteger.valueOf(x.toLong())
        return bg.isProbablePrime(x)
    }

    private fun readFile(fileName: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        File("src/tests/$fileName").forEachLine {
            list.add(it)
        }
        return list
    }
}