package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",  2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("-------imprimir todos elementos---------")
    repositorio.findAll().forEach{ println(it) }

    println("-------remove por id elementos---------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it) }
}