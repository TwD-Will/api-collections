package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao", salario = 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria",4000.0)

    val funcionario = listOf(joao, pedro, maria)

    funcionario.forEach{ println(it) }

    println("---find para encontrar a variavel na lista----")
    println(funcionario.find { it.nome == "Maria" })
}

data class  Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
    """
        Nome:       $nome
        Salario:    $salario
    """.trimIndent()

}