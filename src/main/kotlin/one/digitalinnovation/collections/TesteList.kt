package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",  2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionario = listOf(joao, pedro, maria)

    funcionario.forEach { println(it) }

    println("---find para encontrar a variavel na lista----")
    println(funcionario.find { it.nome == "Maria" })

    println("===-aplicando o sortedBy-===")
    funcionario.sortedBy { it.salario }.forEach { println(it) }
    println("--aplicando o groupBy--")
    funcionario.groupBy { it.tipoContratacao }.forEach { println(it) }

}

