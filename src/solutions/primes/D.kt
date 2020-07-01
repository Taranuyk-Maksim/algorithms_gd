package solutions.primes

fun main(args: Array<String>) {
    val d = D()
    d.run("d.txt", "out_d.txt")
}

class D {

    fun run(input: String, output: String) {
        createFile(output, getSixDigitNumbers(readFile(input)))
    }

    private fun getSixDigitNumbers(arr: ArrayList<String>): ArrayList<String> {
        val list = arrayListOf<String>()
        for (i in 100000..999999) {
            if (isPrimeNumber(i)) {
                var sum = 0
                val intArr = i.toString().toCharArray()
                for (c in intArr) {
                    sum += c.toString().toInt()
                }
                if (sum == arr[0].toInt()) {
                    list.add(i.toString())
                } else {
                    continue
                }
            }
        }
        return list
    }
}