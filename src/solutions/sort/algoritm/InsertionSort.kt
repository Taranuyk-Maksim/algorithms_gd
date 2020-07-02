package solutions.sort.algoritm

fun insertionSort(array: ArrayList<Int>) : ArrayList<Int> {
    for (i in 1 until array.size) {
        val current = array[i]
        var j = i - 1
        while (j >= 0 && current < array[j]) {
            array[j + 1] = array[j]
            j--
        }
        // в этой точке мы вышли, так что j так же -1
        // или в первом элементе, где текущий >= a[j]
        array[j + 1] = current
    }
    return array
}