package one.digitalinnovation.collections

fun main() {
    //criar um array com varias capacidades de usar
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    values.forEach {
        println(it)
    }
    println("--")

    values.sort()
    for (valor in values){
        println(valor)
    }
    println("==")
    values.forEach {
        println(it)
    }
}