package solutions

import java.io.File

fun main(args: Array<String>) {
    val g = G()
    g.run("g.txt","out_g.txt")
}
class G {

    fun run(input : String, output : String) {
        createFile(output, calculator(readFile(input)))
    }

    private fun createFile(name: String, list : String) {
        val f = File("src/outputs/$name")
        f.writeText(list)
    }

    private fun calculator(arr: ArrayList<String>): String {
        var nod = nod(arr[0].toInt(),arr[1].toInt())
        for (i in arr){
            if(i.toInt() != 0) {
                nod = nod(nod,i.toInt())
            }else {
                return nod.toString()
            }
        }
        return nod.toString()
    }

    private fun nod(a_ : Int , b_ : Int) : Int{
        var a = a_
        var b = b_
        while (b !=0) {
            val tmp = a%b
            a = b
            b = tmp
        }
        return a
    }

    private fun readFile(fileName: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        File("src/tests/$fileName").forEachLine {
            list.add(it)
        }
        return list
    }
}