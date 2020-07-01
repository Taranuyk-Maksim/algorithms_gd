package solutions.primes

fun main(args: Array<String>) {
    val f = F()
    f.run("f.txt", "out_f.txt")
}

class F {

    fun run(input: String, output: String) {
        createFile(output, getMaxDivisor(readFile(input)))
    }

    private fun getMaxDivisor(arr: ArrayList<String>): String {
        val n1 = nod(arr[0].toInt(), arr[1].toInt())
        return nod(n1, arr[2].toInt()).toString()
    }

}