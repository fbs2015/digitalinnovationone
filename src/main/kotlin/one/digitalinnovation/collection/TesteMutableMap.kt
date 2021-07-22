package one.digitalinnovation.collection

fun main(){
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 3500.0, "PJ")
    val carlos = Funcionario("Carlos", 4500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)


    println(repositorio.findById(joao.nome))

    println("---------------------------")

    repositorio.findAll().forEach { println(it) }

    println("---------------------------")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}