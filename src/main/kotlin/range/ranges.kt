package range

fun main(){

    //Criando ranges:
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print(" "+ s)
    }

    println()

    //Criando ranges de modo simplificado e com saltos de 2 em 2 (pares):
    val numerosPares = 0..100 step 2
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }

    println()

    //Criando ranges de modo simplificado, com saltos de 2 em 2 (pares) e sem incluir o 100:
    val numerosParesSem100 = 0.until(100) step 2
    for(numeroPar2 in numerosParesSem100){
        print("$numeroPar2 ")
    }

    println()

    //Criando ranges REVERSO de modo simplificado e com saltos de 2 em 2 (pares):
    val numerosParesReverso = 100 downTo 0 step 2
    for(numeroParReverso in numerosParesReverso){
        print("$numeroParReverso ")
    }

    println()

    //Criando um range, e depois verificando se um valor está dentro desse range (Devem ser do mesmo tipo)!
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if(salario in intervalo){
        println("O salário está dentro do intervalo!")
    }else{
        println("O salário não está dentro do intervalo!")
    }

    println()

    //Criando um range, e depois verificando se um valor está dentro desse range (Devem ser do mesmo tipo)!
    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}