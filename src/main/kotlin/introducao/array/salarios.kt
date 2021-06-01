package introducao.array

fun main(){

    //Patrão quer aplicar um aumento de 10% nos salários!

/*

    //Criando array de salario
    val salarios = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    var taxaAumento = 1.1

    //O código abaixo não funciona, pois a referencia salario é imutavel!
    for(salario in salarios){
        salario = salario * taxaAumento
    }

 */

/*
    //Criando array de salario e percorrendo o array com um indice criado por nós mesmos
    val salarios = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)
    var taxaAumento = 1.1
    var indice = 0

    for(salario in salarios){
        salarios[indice] = salario * taxaAumento
        indice++
    }
    println(salarios.contentToString())

*/

/*
    //Criando array de salario e percorrendo o array com um indice
    val salarios = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)
    var taxaAumento = 1.1

    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * taxaAumento
    }
    println(salarios.contentToString())

*/

    val salarios = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)
    var taxaAumento = 1.1

    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * taxaAumento
    }
    println(salarios.contentToString())
}