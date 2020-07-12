package solutions.recurs

import solutions.createFile
import solutions.readFile

fun main() {

    val b = B()
    b.run("recurs_b.txt", "out_recurs_b.txt")
}

class B {
    private var minTime = 0

    fun run(inp: String, out: String) {
        createFile(out, getMinTime(getMatrix(readFile(inp))))
    }

    private fun compareTime(time: Int) {
        if (time < minTime) {
            minTime = time
        }
    }

    private fun getMinTime(inputArray: ArrayList<ArrayList<Int>>): Int {
        for (i in 0.until(inputArray.size))
            minTime += inputArray[i][0]
        getPathTime(inputArray, 0, 0)
        return minTime
    }

    private fun getPathTime(inputArray: ArrayList<ArrayList<Int>>, i: Int, sumTime: Int) {
        if (isEnd(inputArray, i)) {
            compareTime(sumTime)
        } else {
            getPathTime(inputArray, i + 1, sumTime + inputArray[i][0])
            if (!isEnd(inputArray, i + 1)) {
                getPathTime(inputArray, i + 2, sumTime + inputArray[i][1])
            }
            if (!isEnd(inputArray, i + 2)) {
                getPathTime(inputArray, i + 3, sumTime + inputArray[i][2])
            }
        }
    }

    private fun isEnd(inputArray: ArrayList<ArrayList<Int>>, i: Int): Boolean {
        return try {
            inputArray[i][0]
            false
        } catch (ex: Exception) {
            true
        }
    }
}