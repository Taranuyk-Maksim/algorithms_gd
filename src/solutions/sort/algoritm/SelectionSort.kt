package solutions.sort.algoritm

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
        // замена
        val temp = array[i]
        array[i] = min
        array[minId] = temp
    }
    return array
}