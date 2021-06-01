package list

// Class do tipo data é um tipo especial de class, ela tem tudo que uma class normal tem e traz algumas coias prontas como:
// já fornece funções como toString para seus atributos, Hash & Equals, etc...
// A propertie editora poderá ser nula, logo tera um '?' no seu tipo
data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
    ) : Comparable<Livro>{

    //Vamos orderar os livros por ano de publicação
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }



}