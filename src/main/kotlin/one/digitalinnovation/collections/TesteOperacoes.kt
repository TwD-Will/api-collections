package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2550.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("== maior, menor e media de array==")

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")
    println("===- array maior que 2500--===")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{println(it)}

    println("----add a count entre os arrays--==-=-")
    println(salarios.count {it in 2000.0..5000.0})

    println("===pegar valor especifico dentro do array====")
    println(salarios.find {it == 2550.0})
    println(salarios.find {it == 550.0})

    println("---qualquer elemento dentro do array true or false===")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})
}