package solutions.primes

fun main(args: Array<String>) {
    val b = B()
    b.run("b.txt", "out_b.txt")
}

class B {

    fun run(inp: String, out: String) {
        createFile(out, getArrayOfPrimeNumbers(readFile(inp)))
    }

    private fun getArrayOfPrimeNumbers(arr: ArrayList<String>): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        var i = 0
        while (true) {
            i++
            if (isPrimeNumber(i)) {
                list.add(i.toString())
            }
            if (list.size == arr[0].toInt()) {
                return list
            }
        }
    }
}