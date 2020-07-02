package solutions.sort.old

import kotlin.math.abs

class Num(private val n: Int) {

    fun getAbs(): Int {
        return abs(n)
    }

    fun getNum(): Int {
        return n
    }

    fun getSum (): Int {
        var sum = 0
        for(i in getAbs().toString().toCharArray()) {
            sum +=i.toString().toInt()
        }
        return sum
    }
}