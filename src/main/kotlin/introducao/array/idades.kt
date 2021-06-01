package introducao.array

fun main() {
/*

    //Patrão quer saber a maior idade entre os funcionários.
    //Fazendo sem array:
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33

    val maioridade = if (idade1 > idade2 && idade1 > idade3){
        idade1
    }else if(idade2> idade3){
        idade2
    }else{
        idade3
    }
    println("A maior idade é: $maioridade")

*/

/*

    //Fazendo com Array - Percorrendo com for:
    val idades = IntArray(3)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33

    var maiorIdade = Int.MIN_VALUE
    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println("A maior idade é: $maiorIdade")

*/

    //Fazendo com Array - Percorrendo com foreach:
    val idades = intArrayOf(25, 19, 33)
    var maiorIdade = Int.MIN_VALUE
    idades.forEach { idade ->
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println("A maior idade é: $maiorIdade")
}