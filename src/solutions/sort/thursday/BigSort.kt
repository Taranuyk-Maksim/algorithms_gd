package solutions.sort.thursday

import solutions.primes.createFileAndAppendText
import solutions.primes.readFile
import solutions.sort.algoritm.*
import solutions.sort.wednesday.getListIntNumbers

fun main(args: Array<String>) {
    val sortB = BigSort()
    sortB.run("sort_seven.txt", "out_sort_seven.txt")
}

class BigSort {
    var list = arrayListOf<String>()
    fun initList(inp : String) {
        list = readFile(inp)
    }

    fun run(inp: String, out: String) {
        initList(inp)
        runBubbleSort(getListIntNumbers(list[0]),out)
        runHeapSort(getListIntNumbers(list[1]),out)
        runInsertionSort(getListIntNumbers(list[2]),out)
        runQuickSort(getListIntNumbers(list[3]),out)
        runMergeSort(getListIntNumbers(list[4]),out)
        runSelectionSort(getListIntNumbers(list[5]),out)
    }

    private fun runBubbleSort(list: ArrayList<Int>, out: String) {
        bubbleSort(list)
        createFileAndAppendText(out,list,"BubbleSort")
    }
    private fun runHeapSort(list: ArrayList<Int>, out: String) {
        heapSort(list)
        createFileAndAppendText(out,list,"HeapSort")
    }
    private fun runInsertionSort(list: ArrayList<Int>, out: String) {
        insertionSort(list)
        createFileAndAppendText(out,list,"InsertionSort")
    }
    private fun runMergeSort(list: ArrayList<Int>, out: String) {
        mergeSort(list,0,list.size - 1)
        createFileAndAppendText(out,list,"MergeSort")
    }
    private fun runQuickSort(list: ArrayList<Int>, out: String) {
        solutions.sort.algoritm.quickSort(list,0,list.size-1)
        createFileAndAppendText(out,list,"QuickSort")
    }
    private fun runSelectionSort(list: ArrayList<Int>, out: String) {
        selectionSort(list)
        createFileAndAppendText(out,list,"SelectionSort")
    }

}