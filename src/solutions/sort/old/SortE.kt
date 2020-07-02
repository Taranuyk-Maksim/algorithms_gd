package solutions.sort.old

import solutions.primes.createFile
import solutions.primes.readFile

fun main(args: Array<String>) {
    val sortE = SortE()
    sortE.run("sort_e.txt", "out_sort_e.txt")
}

class SortE {
    fun run(inp: String, out: String) {
        createFile(
                out,
                createOutputList(
                        quickSortNumbsSumOfElements(getListNums(readFile(inp)[1])))
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
