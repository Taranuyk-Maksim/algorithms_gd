package solutions.sort.algoritm

import java.util.Collections.swap

fun sort(array: ArrayList<Int>) {
    var h = 1
    while (h * 3 < array.size) h = h * 3 + 1
    while (h >= 1) {
        shellSort(array, h)
        h /= 3
    }
}

private fun shellSort(array: ArrayList<Int>, h: Int) {
    val length = array.size
    for (i in h until length) {
        var j = i
        while (j >= h) {
            if (array[j] < array[j - h]) swap(array, j, j - h) else break
            j -= h
        }
    }
}
