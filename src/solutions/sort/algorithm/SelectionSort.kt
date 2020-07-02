package solutions.sort.algorithm

fun selectionSort(array: ArrayList<Int>) : ArrayList<Int>{
    for (i in array.indices) {
        var min = array[i]
        var minId = i
        for (j in i + 1 until array.size) {
            if (array[j] < min) {
                min = array[j]
                minId = j
            }
        }
        // replacement
        val temp = array[i]
        array[i] = min
        array[minId] = temp
    }
    return array
}