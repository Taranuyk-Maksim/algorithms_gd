package solutions.sort.old

import solutions.primes.createFile
import solutions.primes.readFile

fun main(args: Array<String>) {
    val sortD = SortD()
    sortD.run("sort_d.txt", "out_sort_d.txt")
}

class SortD {

    private val positiveNumbers = arrayListOf<Int>()
    private val negativeNumbers = arrayListOf<Int>()
    private val zeroNumbers = arrayListOf<Int>()

    fun run(inp: String, out: String) {
        val list = getListIntNumbers(readFile(inp)[1])
        sortNumbersByType(list)
        createFile(out, createOutputList())
    }

    private fun createOutputList(): List<Int> {
        val arr = arrayListOf<Int>()
        arr.addAll(quickSort(negativeNumbers))
        arr.addAll(zeroNumbers)
        arr.addAll(quickSort(positiveNumbers.reversed()))
        return arr
    }

    private fun sortNumbersByType(list: ArrayList<Int>): List<Int> {
        val arr = arrayListOf<Int>()

        for (i in list) {
            when {
                i < 0 -> {
                    negativeNumbers.add(i)
                }
                i > 0 -> {
                    positiveNumbers.add(i)
                }
                else -> {
                    zeroNumbers.add(i)
                }
            }
        }
        return arr
    }
}
