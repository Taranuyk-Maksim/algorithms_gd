package solutions.sort.algorithm

fun mergeSort(array: ArrayList<Int>, left: Int, right: Int) : ArrayList<Int>{
    if (right <= left) return array
    val mid = (left + right) / 2
    mergeSort(array, left, mid)
    mergeSort(array, mid + 1, right)
    merge(array, left, mid, right)
    return array
}

fun merge(array: ArrayList<Int>, left: Int, mid: Int, right: Int) {
    // calculate the length
    val lengthLeft = mid - left + 1
    val lengthRight = right - mid

    // создаем временные подмассивы
    val leftArray = IntArray(lengthLeft)
    val rightArray = IntArray(lengthRight)

    // create temporary subarrays
    for (i in 0 until lengthLeft) leftArray[i] = array[left + i]
    for (i in 0 until lengthRight) rightArray[i] = array[mid + i + 1]

    // iterators contain the current temporary subarray index
    var leftIndex = 0
    var rightIndex = 0

    // copy from leftArray and rightArray back to the array
    for (i in left until right + 1) {
        // if there are un copied elements in R and L, copy the minimum
        if (leftIndex < lengthLeft && rightIndex < lengthRight) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex]
                leftIndex++
            } else {
                array[i] = rightArray[rightIndex]
                rightIndex++
            }
        } else if (leftIndex < lengthLeft) {
            array[i] = leftArray[leftIndex]
            leftIndex++
        } else if (rightIndex < lengthRight) {
            array[i] = rightArray[rightIndex]
            rightIndex++
        }
    }
}
