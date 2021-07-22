package one.digitalinnovation.collection
import one.digitalinnovation.collection.Funcionario

fun main(){
    val maria = Funcionario("Maria", 5000.0,"CLT")
    val joao = Funcionario("João", 3000.0,"CLT")
    val pedro = Funcionario("Pedro", 3500.0, "PJ")

    //Esse tipo de list não é possivel incluir novo dado.
    //Não são mutables!
    val funcionarios = listOf(maria, joao, pedro)

    funcionarios.forEach{println(it)}
    println(funcionarios.find { it.nome == "Maria" })
    println("-----------------------")
    funcionarios.sortedBy { it.salario  }.forEach{println(it)}
    println("-----------------------")
    funcionarios.groupBy { it.tipoContratacao  }.forEach{println(it)}
}

