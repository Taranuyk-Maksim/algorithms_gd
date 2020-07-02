package solutions.sort.old

import solutions.primes.createFile
import solutions.primes.readFile

fun main(args: Array<String>) {
    val sortB = SortB()
    sortB.run("sort_b.txt", "out_sort_b.txt")
}

class SortB {
    fun run(inp: String, out: String) {
        createFile(
                out,
                createOutputList(
                        quickSortNumbs(getListNums(readFile(inp)[1])))
        )
    }

    private fun createOutputList(list: List<Num>): List<Int> {
        val arr = arrayListOf<Int>()
        for (a in list) {
            arr.add(a.getNum())
        }
        return arr
    }
}
