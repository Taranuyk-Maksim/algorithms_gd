package solutions.sort.wednesday

import solutions.createFile
import solutions.readFile

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
