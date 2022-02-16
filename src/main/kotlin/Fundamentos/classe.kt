package Fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Meu nome é ${nome} e tenho ${idade} anos"
    }
}

fun main() {
    var Leonardo = Pessoa("Leonardo", 25)
    println(Leonardo)
}