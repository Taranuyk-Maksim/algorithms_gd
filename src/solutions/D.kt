package solutions

import java.io.File
import java.math.BigInteger

fun main(args: Array<String>) {
    val d = D()
    d.run("d.txt","out_d.txt")
}
class D {

    fun run(input : String, output : String) {
        createFile(output, calculator(readFile(input)))
    }

    private fun createFile(name: String, list : String) {
        val f = File("src/outputs/$name")
        f.writeText(list)
    }

    private fun calculator(arr: ArrayList<String>): String {
        for (i in 100000.until(999999)) {
            if(isPrime(i)){
                var sum = 0
                for (c in i.toString().toCharArray()){
                    sum += c.toString().toInt()
                    if(arr[0].toInt() == sum){
                        return i.toString()
                    }
                }
            }
        }
        return ""
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