package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //maneiras diferentes de interar
    for (valor in values){
        println(valor)
    }
    println("---")
    values.forEach {
        println(it)
    }
    println("____")
    for ( index in values.indices){
        println(values[index])
    }
    println("===")
    //ordenação do maior para o menor
    values.sort()
    for (valor in values){
        println(valor)
    }
}