package one.digitalinnovation.collection

fun main(){

    val salarios = doubleArrayOf(1250.0, 2000.0, 2500.0, 3500.0, 5000.0, 1350.0, 2450.0)
    salarios.sort()
    salarios.forEach{println(it)}

    println("---------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor slario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("------------------------------")
    val salariosMaiores2500 = salarios.filter{it > 2500.0}
    salariosMaiores2500.forEach { println(it) }

    println("-------------------")

    println(salarios.count { it in 2000.0..5000.0 })
    println(salarios.find{ it == 2450.0})
    println(salarios.find{ it == 1000.0})

    println("-------------------")

    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 1250.0})



}