package solutions.sort

import solutions.primes.createFile
import solutions.primes.readFile

fun main(args: Array<String>) {
    val sortC = SortC()
    sortC.run("sort_c.txt", "out_sort_c.txt")
}

class SortC {
    fun run(inp: String, out: String) {
        val list = getListIntNumbers(readFile(inp)[1])

        createFile(
                out,
                createOutputList(
                        getAllEvenNumbers(list),
                        getOddNumbers(list))
        )
    }

    private fun createOutputList(evenNumbers: List<Int>, oddNumbers: List<Int>): List<Int> {
        val arr = arrayListOf<Int>()
        arr.addAll(quickSort(evenNumbers))
        arr.addAll(quickSort(oddNumbers))
        return arr
    }

    private fun getAllEvenNumbers(list : ArrayList<Int>) : List<Int>{
        val arr = arrayListOf<Int>()
        for (i in list){
            if ((i % 2)==0){
                arr.add(i)
            }
        }
        return arr
    }
    private fun getOddNumbers(list : ArrayList<Int>) : List<Int>{
        val arr = arrayListOf<Int>()
        for (i in list){
            if ((i % 2) != 0){
                arr.add(i)
            }
        }
        return arr
    }
}
