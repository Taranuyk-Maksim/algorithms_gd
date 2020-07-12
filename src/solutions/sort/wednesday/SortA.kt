package solutions.sort.wednesday

import solutions.createFile
import solutions.readFile

fun main(args: Array<String>) {
    val sortA = SortA()
    sortA.run("sort_a.txt", "out_sort_a.txt")
}

class SortA {
    fun run(inp: String, out: String) {
        createFile(out, quickSort(getListIntNumbers(readFile(inp)[1])))
    }
}
