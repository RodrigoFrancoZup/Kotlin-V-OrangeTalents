package range

fun main(){
    //Array de idade:
    val idades: IntArray = intArrayOf(10,12,18,33,40,67)

    //Pegando maior idade
    val maiorIdade = idades.maxOrNull()

    println("A maior idade é: $maiorIdade")

    //Pegando a menor idade
    val menorIdade = idades.minOrNull()
    println("A menor idade é: $menorIdade")

    //Pegando a media de idade
    val mediaIdade = idades.average()
    println("A média de idade é: $mediaIdade")

    //Verificar se todos são maiores de 18 anos
    val todosMaioires = idades.all { it >= 18 }
    println("Todos são maiores? $todosMaioires")

    //Verificar se pelo menos um é maior de 18 anos
    val haPeloMenosUmMaioir = idades.any() { it >= 18 }
    println("Existe pelo menos um maior de idade? $haPeloMenosUmMaioir")

    //Filtrar valores: selecionar apenas os maiores de idade. A resposta vai para outra lista
    val filtroMaiorDeIdade = idades.filter { it >= 18 }
    println("Os maiores de idade: $filtroMaiorDeIdade")

    //Filtrar um valor exato: seleciona o elemento desejado e o retorna.
    //Se nesse eu colocar > 18, o valor retornado será o proximo maior, no caso 33! Só retorna um!
    val idadeIgual18 = idades.find { it == 18 }
    println("Selecionei o: $idadeIgual18")
}