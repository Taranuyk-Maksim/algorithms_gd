package solutions.recurs

import solutions.createFile
import solutions.readFile
import solutions.sort.wednesday.getListIntNumbers

fun main() {
    val a = A()
    a.run("recurs_a.txt", "out_recurs_a.txt")

}

class A {
    private var maxWeight = 0
    private var countMaxWeight = 0


    fun run(inp: String, out: String) {
        createFile(out, getMaxPath(getMatrix(readFile(inp))))
    }

    private fun comperePathWight(weight: Int) {
        if (weight > maxWeight) {
            maxWeight = weight
            countMaxWeight = 1
        } else if (weight == maxWeight) {
            countMaxWeight++
        }
    }

    private fun getMaxPath(inputArray: ArrayList<ArrayList<Int>>): List<Int> {
        for (j in 0.until(inputArray[0].size)) {
            getWeightPath(inputArray, 0, j, 0)
        }
        return arrayListOf(maxWeight, countMaxWeight)
    }

    private fun getWeightPath(inputArray: ArrayList<ArrayList<Int>>, i: Int, j: Int, pathSum: Int) {
        val sum = pathSum + inputArray[i][j]
        if (isEnd(inputArray, i + 1, j)) {
            comperePathWight(sum)
        } else {
            if (!isEnd(inputArray, i + 1, j - 1)) {
                getWeightPath(inputArray, i + 1, j - 1, sum)
            }
            getWeightPath(inputArray, i + 1, j, sum)
            if (!isEnd(inputArray, i + 1, j + 1)) {
                getWeightPath(inputArray, i + 1, j + 1, sum)
            }
        }
    }

    private fun isEnd(inputArray: ArrayList<ArrayList<Int>>, i: Int, j: Int): Boolean {
        return try {
            inputArray[i][j]
            false
        } catch (ex: Exception) {
            true
        }
    }
}
