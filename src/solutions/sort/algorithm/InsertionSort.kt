package solutions.sort.algorithm

fun insertionSort(array: ArrayList<Int>) : ArrayList<Int> {
    for (i in 1 until array.size) {
        val current = array[i]
        var j = i - 1
        while (j >= 0 && current < array[j]) {
            array[j + 1] = array[j]
            j--
        }
        // at this point we went out, so j is also -1
        // or in the first element where the current >= a[j]
        array[j + 1] = current
    }
    return array
}