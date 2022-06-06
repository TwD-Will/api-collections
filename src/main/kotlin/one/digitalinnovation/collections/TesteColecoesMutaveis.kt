package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",  2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    println("Lista mutavel, conseguimos alterar")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("-----add something here----")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("-----remove something here----")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-----set----")
    val funcionarioSet = mutableListOf(joao)
    funcionarioSet.forEach{ println(it) }

    println("-----add----")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

    println("-----remove----")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{ println(it) }

}