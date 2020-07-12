package solutions.sort.wednesday

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val sortF = SortF()
    sortF.run("sort_f.txt", "out_sort_f.txt")
}

class SortF {

    fun run(inp: String, out: String) {
        val list = readFile(inp)
        quickSort(getListIntNumbers(list[1]))
        createFile(out, getQuantityKExchanges(list[2]).toString())
    }
}
