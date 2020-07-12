package solutions.recurs

import solutions.createFile
import solutions.createFileWithText
import solutions.readFile
import solutions.sort.wednesday.getListIntNumbers
import kotlin.math.abs

fun main() {
    val c = C()
    c.run("recurs_c.txt", "out_recurs_c.txt")

}

class C {
    var spendEnergy = 0
    var pathArr = arrayListOf(1)

    fun run(inp: String, out: String) {
        createFileWithText(getAllValue(getListIntNumbers(readFile(inp)[0])), out)
    }

    fun getAllValue(inputArray: ArrayList<Int>): ArrayList<Int> {
        val list = arrayListOf<Int>()
        getEnergyValue(inputArray, 0, 0)
        list.add(spendEnergy)
        list.add(pathArr.size)
        list.addAll(pathArr)

        println(spendEnergy)
        println(pathArr.size)
        println(pathArr)
        return list
    }

    private fun getEnergyValue(inputArray: ArrayList<Int>, i: Int, energy: Int) {
        spendEnergy = energy
        if (!isEnd(inputArray, i + 1)) {
            try {
                if ((abs(inputArray[i + 2] - inputArray[i]) * 3) <
                        (abs(inputArray[i + 1] - inputArray[i]) + abs(inputArray[i + 2] - inputArray[i + 1]))) {

                    spendEnergy += abs(inputArray[i + 2] - inputArray[i]) * 3
                    pathArr.add(i + 3)
                    getEnergyValue(inputArray, i + 2, spendEnergy)
                } else {
                    spendEnergy += abs(inputArray[i + 1] - inputArray[i])
                    pathArr.add(i + 2)
                    getEnergyValue(inputArray, i + 1, spendEnergy)
                }
            } catch (ex: Exception) {
                pathArr.add(i + 2)
                spendEnergy += abs(inputArray[i + 1] - inputArray[i])
                getEnergyValue(inputArray, i + 1, spendEnergy)
            }
        }
    }

    private fun isEnd(inputArray: ArrayList<Int>, i: Int): Boolean {
        return try {
            inputArray[i]
            false
        } catch (ex: Exception) {
            true
        }
    }
}