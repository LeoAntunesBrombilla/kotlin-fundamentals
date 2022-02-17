package Fundamentos

class Dono(var nome: String, var sobrenome: String, var idade: Int, val id: Int) {

}

data class Livro(val nome: String, val categoria: String, var dono: Dono) {

}


fun main() {
    var livro = Livro("Game of thrones", "fantasia", Dono("Leonardo", "Antunes", 25, 3423423))


    println(livro)

    livro.dono.nome = "Pedro"

}