package solutions.sort

import solutions.sort.Num

fun quickSort(items: List<Int>): List<Int> {
    if (items.count() < 2) {
        return items
    }
    val pivot = items[items.count() / 2]

    val equal = items.filter { it == pivot }

    val less = items.filter { it < pivot }

    val greater = items.filter { it > pivot }

    return quickSort(less) + equal + quickSort(greater)
}

fun quickSortNumbs(items: List<Num>): List<Num> {
    if (items.count() < 2) {
        return items
    }
    val pivot = items[items.count() / 2]

    val equal = items.filter { it.getAbs() == pivot.getAbs() }

    val less = items.filter { it.getAbs() < pivot.getAbs() }

    val greater = items.filter { it.getAbs() > pivot.getAbs() }

    return quickSortNumbs(less) + equal + quickSortNumbs(greater)
}

fun getListIntNumbers(str: String): ArrayList<Int> {

    val numbers = arrayListOf<Int>()
    val buf = StringBuilder()
    val chars = str.toCharArray()

    for (i in 0..str.length) {
        try {
            val ch = chars[i].toString()
            if (ch != " ") {
                buf.append(ch)
            } else {
                numbers.add(buf.toString().toInt())
                buf.clear()
            }
        } catch (ex: ArrayIndexOutOfBoundsException) {
            numbers.add(buf.toString().toInt())
        }
    }
    return numbers
}

fun getListNums(str: String): List<Num> {

    val numbers = arrayListOf<Num>()
    val buf = StringBuilder()
    val chars = str.toCharArray()

    for (i in 0..str.length) {
        try {
            val ch = chars[i].toString()
            if (ch != " ") {
                buf.append(ch)
            } else {
                numbers.add(Num(buf.toString().toInt()))
                buf.clear()
            }
        } catch (ex: ArrayIndexOutOfBoundsException) {
            numbers.add(Num(buf.toString().toInt()))
        }
    }
    return numbers
}