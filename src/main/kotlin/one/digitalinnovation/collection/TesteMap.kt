package one.digitalinnovation.collection

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ println(it)}
    println("--------------------")
    map1.forEach{(k, v) -> println("Chave: ${k} - Value: ${v}")}
    println("--------------------")
    val map2 = mapOf("Pedro" to 2500.0, "Maria" to 5000.0)
    map2.forEach{(k, v) -> println("Key: ${k} - Value: ${v}")}
}