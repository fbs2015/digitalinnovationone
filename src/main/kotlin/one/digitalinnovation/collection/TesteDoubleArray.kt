package one.digitalinnovation.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }


    val salarios2 = doubleArrayOf(2500.0, 1500.0,3500.0,)
    salarios2.sort()
    salarios2.forEach { println(it) }
}