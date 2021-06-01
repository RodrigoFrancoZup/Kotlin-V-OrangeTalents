package list

import imprimeComMarcadores

fun main() {
    val pratileira = Prateleira(genero = "Literatura", livros = listaDeLivrosCompleta)

    val porAutor = pratileira.organizarPorAutor()
    val porAnoPublicacao = pratileira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}