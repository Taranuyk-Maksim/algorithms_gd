package solutions.sort.algorithm

import java.util.Collections.swap

fun shellSort(array: ArrayList<Int>) {
    var h = 1
    while (h * 3 < array.size) h = h * 3 + 1
    while (h >= 1) {
        hSort(array, h)
        h /= 3
    }
}

private fun hSort(array: ArrayList<Int>, h: Int) {
    val length = array.size
    for (i in h until length) {
        var j = i
        while (j >= h) {
            if (array[j] < array[j - h]) swap(array, j, j - h) else break
            j -= h
        }
    }
}
