package solutions.sort.thursday

import solutions.primes.createFileAndAppendText
import solutions.primes.readFile
import solutions.sort.algorithm.*
import solutions.sort.wednesday.getListIntNumbers

fun main(args: Array<String>) {
    val sortB = BigSort()
    sortB.run("sort_seven.txt", "out_sort_seven.txt")
}

class BigSort {
    var list = arrayListOf<String>()
    fun initList(inp: String) {
        list = readFile(inp)
    }

    fun run(inp: String, out: String) {
        initList(inp)
        runBubbleSort(getListIntNumbers(list[0]), out)
        runHeapSort(getListIntNumbers(list[1]), out)
        runInsertionSort(getListIntNumbers(list[2]), out)
        runQuickSort(getListIntNumbers(list[3]), out)
        runMergeSort(getListIntNumbers(list[4]), out)
        runSelectionSort(getListIntNumbers(list[5]), out)
    }

    //O(n^2)
    private fun runBubbleSort(list: ArrayList<Int>, out: String) {
        bubbleSort(list)
        createFileAndAppendText(out, list, "BubbleSort")
    }

    //O(nlog n)
    private fun runHeapSort(list: ArrayList<Int>, out: String) {
        heapSort(list)
        createFileAndAppendText(out, list, "HeapSort")
    }

    //O(n^2)
    private fun runInsertionSort(list: ArrayList<Int>, out: String) {
        insertionSort(list)
        createFileAndAppendText(out, list, "InsertionSort")
    }

    //O(n log n)
    private fun runMergeSort(list: ArrayList<Int>, out: String) {
        mergeSort(list, 0, list.size - 1)
        createFileAndAppendText(out, list, "MergeSort")
    }

    // O(n^2)
    private fun runQuickSort(list: ArrayList<Int>, out: String) {
        solutions.sort.algorithm.quickSort(list, 0, list.size - 1)
        createFileAndAppendText(out, list, "QuickSort")
    }
    // O(n^2)
    private fun runSelectionSort(list: ArrayList<Int>, out: String) {
        selectionSort(list)
        createFileAndAppendText(out, list, "SelectionSort")
    }

}