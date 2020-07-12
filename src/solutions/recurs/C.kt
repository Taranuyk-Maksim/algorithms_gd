package solutions.recurs

import kotlin.math.abs

fun main() {
    val arr = arrayOf(1, 2, 30,30)
    val c = C()
    c.getEnergyValue(arr, 0, 0)
    println(c.spendEnergy)
    println(c.pathArr)
    println(c.pathArr.size)

}

class C {
    var spendEnergy = 0
    var pathArr  = arrayListOf(1)

    fun getEnergyValue(inputArray: Array<Int>, i: Int, energy: Int) {
        if (isEnd(inputArray, i + 1)) {
            spendEnergy = energy + abs(inputArray[i] - inputArray[i - 1])
            pathArr.add(i+1)
        } else {
            try {
                if ((abs(inputArray[i + 2] - inputArray[i]) * 3) <
                        (abs(inputArray[i + 1] - inputArray[i])
                                + abs(inputArray[i + 2] - inputArray[i + 1]))) {
                    spendEnergy += abs(inputArray[i + 2] - inputArray[i]) * 3
                    pathArr.add(i+3)
                    getEnergyValue(inputArray, i + 2, spendEnergy)
                } else {
                    spendEnergy += abs(inputArray[i + 1] - inputArray[i])
                    pathArr.add(i+2)
                    getEnergyValue(inputArray, i + 1, spendEnergy)
                }
            } catch (ex: ArrayIndexOutOfBoundsException) {
                getEnergyValue(inputArray, i + 1, spendEnergy)
            }
        }
    }

    private fun isEnd(inputArray: Array<Int>, i: Int): Boolean {
        return try {
            inputArray[i]
            false
        } catch (ex: ArrayIndexOutOfBoundsException) {
            true
        }
    }
}