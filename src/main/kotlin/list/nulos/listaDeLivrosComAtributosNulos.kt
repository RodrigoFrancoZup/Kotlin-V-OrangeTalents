package list.nulos

import list.listaDeLivrosCompleta

fun main(){
    listaDeLivrosCompleta
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach{(editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}