import java.io.File

fun main(args: Array<String>) {
    val a1 = A()
    a1.run(readFile("src/tests/a.txt"))
}
fun readFile(fileName: String) : ArrayList<String>{
    val list : ArrayList<String> = ArrayList()
    File(fileName).forEachLine {
        list.add(it)
    }
    return list

}
