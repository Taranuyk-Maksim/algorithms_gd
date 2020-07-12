package solutions.recurs

import solutions.sort.wednesday.getListIntNumbers

fun getMatrix(arr: ArrayList<String>): ArrayList<ArrayList<Int>> {
    val matrix = arrayListOf<ArrayList<Int>>()
    for (a in arr) {
        matrix.add(getListIntNumbers(a))
    }
    return matrix
}
