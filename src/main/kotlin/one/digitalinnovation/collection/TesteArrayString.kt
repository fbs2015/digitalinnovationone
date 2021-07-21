package one.digitalinnovation.collection

fun main(){
    //Aqui não seria necessario o <String>,
    //pois ele infere pelo tipo na inicialização
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    nomes.forEach{
        println(it)
    }
    println("------------------------------")
    nomes.sort()
    nomes.forEach{println(it)}

    println("------------------------------")
    val nomes2 = arrayOf("Fernando", "Rodrigo", "Paty", "Sandro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}