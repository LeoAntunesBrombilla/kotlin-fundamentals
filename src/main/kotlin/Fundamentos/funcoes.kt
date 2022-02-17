package Fundamentos

fun main() {
    dizOla("Leonardo", "Antunes")
    println(retornaIdade(25))
}

fun dizOla(nome: String, sobrenome: String) {
    println("Olá ${nome} ${sobrenome}")
}

fun retornaIdade(idade: Int): Int {
    return idade
}