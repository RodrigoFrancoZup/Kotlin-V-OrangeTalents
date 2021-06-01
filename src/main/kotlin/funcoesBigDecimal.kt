import java.math.BigDecimal

//vararg indica que vamos passar X número de quantidade de variável, podemos passar 1 valor, 2 valores, etc...
//vararg ao pegará o todas as variáveis e colocará em um array cujo size é X
//Motivo desse metodo é facilitar a criação de array de BigDecimal
fun bigDecimalArrayOf(vararg valores: String):Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

//Em array de tipos pimitivos é possível usar a função sum(), mas como BigDecimal não é primitivo, não tem!
//Vamos criar nossa função sum, chamado somatoria
//Para manter esse padrão (chamar função com "." apos o array - queremos fazer salarios.somatoria()) temos que criar uma funçao: extend function
//Abaixo é assinatura de nossa extend function, onde Array<BigDecimal> é o que vamos receber - é o array que vai chamar (tratamos este como 'this')
//Reduce é uma função para somar todos os elementos de um conjunto
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}


