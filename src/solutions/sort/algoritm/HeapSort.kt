package solutions.sort.algoritm

fun heapify(array: ArrayList<Int>, length: Int, i: Int) {
    val leftChild = 2 * i + 1
    val rightChild = 2 * i + 2
    var largest = i

    // если левый дочерний больше родительского
    if (leftChild < length && array[leftChild] > array[largest]) {
        largest = leftChild
    }

    // если правый дочерний больше родительского
    if (rightChild < length && array[rightChild] > array[largest]) {
        largest = rightChild
    }

    // если должна произойти замена
    if (largest != i) {
        val temp = array[i]
        array[i] = array[largest]
        array[largest] = temp
        heapify(array, length, largest)
    }
}

fun heapSort(array: ArrayList<Int>) : ArrayList<Int>{
    if (array.isEmpty()) return array

    // Строим кучу
    val length = array.size
    // проходим от первого без ответвлений к корню
    for (i in length / 2 - 1 downTo 0) heapify(array, length, i)
    for (i in length - 1 downTo 0) {
        val temp = array[0]
        array[0] = array[i]
        array[i] = temp
        heapify(array, i, 0)
    }
    return array
}