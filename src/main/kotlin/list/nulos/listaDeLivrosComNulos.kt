package list.nulos

import imprimeComMarcadores
import list.listaLivrosComNulos

fun main(){
    //O código abaixo não compila, pois a nossa lista é nullable (pode ter nulo) e o método imprimeComMarcadores não foi feito para aceitar!
    //O codigo abaixo vai compila se configurarmos o método para aceitar lista com nulos e fazer o safe call! ( colocar '?" nos it, ficando it?), assim só será chamado o it se ele não fou nulo
    listaLivrosComNulos.imprimeComMarcadores()


}