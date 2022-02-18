package Fundamentos

fun main() {

    println(parOuImpar(3))
    mediaAluno(10)
}

fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0) {
        "Pair"
    } else {
        "Impar"
    }
}

fun mediaAluno(media: Int){
    if(media < 7) {
        println("Aluno Reprovado")
    } else if (media >= 7 && media < 10) {
        println("Aluno Aprovado")
    } else {
        println("Aluno Gabaritou!")
    }
}