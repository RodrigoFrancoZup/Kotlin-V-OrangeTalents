package list

import imprimeComMarcadores

fun main() {
    //Criando os livros
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    //Criando uma lista mutável:
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    //Adiciona um novo elemento na lista
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimaras Rosa",
            anoPublicacao = 1946
        )
    )

    //Remove o objeto livro1 da lista
    livros.remove(livro1)

    //println(livros)
    livros.imprimeComMarcadores()
    println()

    //Ordenando a nossa lista
    val ordenadoPorAnoPublicacao = livros.sorted()
    ordenadoPorAnoPublicacao.imprimeComMarcadores()
    println()

    //Ordenando pelo autor
    val ordenadoPorAutor = livros.sortedBy { it.autor }
    ordenadoPorAutor.imprimeComMarcadores()

    //Carregando uma lista maior de livros, que esta no arquivo livros
    //Filtrando pelo nome de autor
    listaDeLivrosCompleta
        .filter { it.autor == "João Guimarães Rosa" }
        .imprimeComMarcadores()

    //Carregando uma lista maior de livros, que esta no arquivo livros
    //Filtrando pelo nome de autor
    //Ordenando pelo ano de publicação
    listaDeLivrosCompleta
        .filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //Carregando uma lista maior de livros, que esta no arquivo livros
    //Filtrando pelo nome de autor que começa com "J"
    //Ordenando pelo ano de publicação
    listaDeLivrosCompleta
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    //Carregando uma lista maior de livros, que esta no arquivo livros
    //Filtrando pelo nome de autor que começa com "J"
    //Ordenando pelo ano de publicação
    //Gerando uma nova lista, que agora só terá os titulos dos livros (função map)
   val titulos: List<String> =  listaDeLivrosCompleta
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map {it.titulo}

    println(titulos)
}

