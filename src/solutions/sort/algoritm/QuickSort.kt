package solutions.sort.algoritm

fun partition(array: ArrayList<Int>, begin: Int, end: Int): Int {
    var counter = begin
    for (i in begin until end) {
        if (array[i] < array[end]) {
            val temp = array[counter]
            array[counter] = array[i]
            array[i] = temp
            counter++
        }
    }
    val temp = array[end]
    array[end] = array[counter]
    array[counter] = temp
    return counter
}

fun quickSort(array: ArrayList<Int>, begin: Int, end: Int) : ArrayList<Int>{
    if (end <= begin) return array
    val pivot = partition(array, begin, end)
    quickSort(array, begin, pivot - 1)
    quickSort(array, pivot + 1, end)
    return array
}