package solutions.sort.algoritm

fun bubbleSort(array: ArrayList<Int>) : ArrayList<Int> {
    var sorted = false
    var temp: Int
    while (!sorted) {
        sorted = true
        for (i in 0 until array.size - 1) {
            if (array[i] > array[i + 1]) {
                temp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = temp
                sorted = false
            }
        }
    }
    return array
}