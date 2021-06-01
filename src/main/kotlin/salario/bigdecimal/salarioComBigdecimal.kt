package salario.bigdecimal

import bigDecimalArrayOf
import media
import somatoria
import java.math.BigDecimal
import java.math.RoundingMode


fun main(){

/*

    //Criando um Array de BigDecimal
    //BigDecimal não é primitivo, e por isso não tem um tipo BigDecimalArray, teremos que usar o <>
    val salarios = Array<BigDecimal>(5){BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()
    salarios[2] = "1500.55".toBigDecimal()
    salarios[3] = "1500.55".toBigDecimal()
    salarios[4] = "1500.55".toBigDecimal()
    println(salarios.contentToString())

*/

    //Criando um Array de BigDecimal
    //BigDecimal não é primitivo, e por isso não tem um tipo BigDecimalArray, teremos que usar o <>
    //Por esse motivo não existe também a função bigDecimalArray.of(passa aqui os valores), mas podemos criá-la
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val taxaAumento = "1.1".toBigDecimal()
/*


    //Função map = mapear os valores do primeiro array para um outro conjunto, no caso foi para outro array
    //Ao mapear também estamos dando o aumento de 10%
    val salariosComAumento = salarios.map {
            salario -> (salario * taxaAumento).setScale(2, RoundingMode.UP)
    }.toTypedArray()

    println(salariosComAumento.contentToString())


 */

    //Função map = mapear os valores do primeiro array para um outro conjunto, no caso foi para outro array
    //Ao mapear também estamos dando o aumento de 10%
    val salariosComAumento = salarios.map {
            salario -> calculaAumentoRelativo(salario, taxaAumento)
    }
        .toTypedArray()

    println("Salarios com aumento : "+salariosComAumento.contentToString())

    //Fazendo o SUM para o nosso próprio array, poie ele não é primitivo
    var gastoMensal = salariosComAumento.somatoria()
    println("Gasto mensal: $gastoMensal")


    val meses = "6".toBigDecimal()
    //Queremos saber o valor pago com os salarios apos aumento em 6 meses
    val gastoTotal = salariosComAumento.fold(gastoMensal){ acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total: $gastoTotal")

    //Ordenando os salários em ordem cescente e os colocando em uma lista
    val salariosOrdenados = salariosComAumento.sorted()

    //Pegando os 3 últimos itens da lista e colocando em outra lista por padrao, mas vamos usar o toTypedArray para voltar em array!
    val osTresUltimosSalarios = salariosOrdenados.takeLast(3).toTypedArray()

    //Array primitivo tem o average() para calcular media, mas estamos com tipos não primitivos
    //Vamos criar essa função!
    val media = osTresUltimosSalarios.media()

    //Estamos criando muitas variaveis  para guardar resultados de funções e dps nao as usamos mais
    //podemos ligar a resposta de uma função na outra, assim:
    //val media = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("A media dos 3 maiores salarios: $media")

}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    taxaAumento: BigDecimal
) = if (salario < "5000.00".toBigDecimal()) {
    salario + "500.00".toBigDecimal()
} else {
    (salario * taxaAumento).setScale(2, RoundingMode.UP)
}

