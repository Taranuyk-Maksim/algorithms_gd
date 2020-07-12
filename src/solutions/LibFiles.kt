package solutions

import java.io.File

fun readFile(fileName: String): ArrayList<String> {
    val list: ArrayList<String> = ArrayList()
    File("src/tests/$fileName").forEachLine {
        list.add(it)
    }
    return list
}

fun createFile(name: String, list: String) {
    val f = File("src/outputs/$name")
    f.writeText(list)
}

fun createFile(name: String, i: Int) {
    val f = File("src/outputs/$name")
    f.writeText(i.toString())
}

fun createFile(name: String, list: ArrayList<String>) {
    val f = File("src/outputs/$name")
    f.writeText(list.toString())
}

fun createFileAndAppendText(name: String, list: List<Int>, typeSort : String) {
    val f = File("src/outputs/$name")
    f.appendText(typeSort)
    f.appendText("\n")
    f.appendText(list.toString())
    f.appendText("\n")
    f.appendText(" ")
    f.appendText("\n")
}

fun createFileWithText(list: List<Int>, name : String) {
    val f = File("src/outputs/$name")
    f.appendText(list[0].toString())
    f.appendText("\n")
    f.appendText(list[1].toString())
    f.appendText("\n")
    f.appendText(list.subList(2,list.size).toString())
    f.appendText("\n")
}
fun createFile(name: String, list: List<Int>) {
    val f = File("src/outputs/$name")
    f.writeText("\n" + list.toString())
}