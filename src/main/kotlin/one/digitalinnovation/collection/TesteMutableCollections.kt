package one.digitalinnovation.collection

fun main(){
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 3500.0, "PJ")
    val carlos = Funcionario("Carlos", 4500.0, "PJ")

    println("-----------LIST--------------")

    val funcionarios = mutableListOf<Funcionario>(joao, pedro)
    funcionarios.forEach { println(it) }

    println("-------------------------")

    funcionarios.add(maria)
    funcionarios.forEach{println(it)}

    println("-------------------------")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("-----------SET---------------")
    val funcionariosSet = mutableSetOf<Funcionario>(joao, pedro, maria)
    funcionariosSet.forEach{println(it)}

    println("-----------------------------")
    funcionariosSet.add(carlos)
    funcionariosSet.forEach{println(it)}

    println("-------------------------")
    funcionariosSet.remove(pedro)
    funcionariosSet.forEach { println(it) }
}