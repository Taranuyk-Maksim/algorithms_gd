package solutions.sort.algorithm

fun heapify(array: ArrayList<Int>, length: Int, i: Int) {
    val leftChild = 2 * i + 1
    val rightChild = 2 * i + 2
    var largest = i

    // if the left child is larger than the parent
    if (leftChild < length && array[leftChild] > array[largest]) {
        largest = leftChild
    }

    // if the right child is greater than the parent
    if (rightChild < length && array[rightChild] > array[largest]) {
        largest = rightChild
    }

    // if a replacement should occur
    if (largest != i) {
        val temp = array[i]
        array[i] = array[largest]
        array[largest] = temp
        heapify(array, length, largest)
    }
}

fun heapSort(array: ArrayList<Int>) : ArrayList<Int>{
    if (array.isEmpty()) return array

    // Building a heap
    val length = array.size
    // we pass from the first without branches to the root
    for (i in length / 2 - 1 downTo 0) heapify(array, length, i)
    for (i in length - 1 downTo 0) {
        val temp = array[0]
        array[0] = array[i]
        array[i] = temp
        heapify(array, i, 0)
    }
    return array
}