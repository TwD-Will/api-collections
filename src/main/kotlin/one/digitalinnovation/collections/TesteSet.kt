package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",  2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)
println("--uniao dos conjuntos--")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it) }

    println("---subtraçao do conjunto---")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach{ println(it) }

    println("---interceçao do conjunto---")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach{ println(it) }
}