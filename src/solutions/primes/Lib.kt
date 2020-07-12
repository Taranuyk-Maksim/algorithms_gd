package solutions.primes

import java.io.File
import java.math.BigInteger

fun isPrimeNumber(x: Int): Boolean {
    val bg: BigInteger = BigInteger.valueOf(x.toLong())
    return bg.isProbablePrime(x)
}

fun nod(v1: Int, v2: Int): Int {
    var a = v1
    var b = v2
    while (b != 0) {
        val tmp = a % b
        a = b
        b = tmp
    }
    return a
}

