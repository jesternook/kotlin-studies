package com.nico.studies

class Fundaments {
}

fun main() {

    //VARIAVEIS
    var mutableVar: Int = 6
    val immutableVar: Int = 6

    mutableVar = 5
    println(mutableVar)
//    immutableVar = 7 //val cannot be reasigned -> devo mudar a variavel para var para poder alterar seu valor inicial


    //CONDICIONAIS
    var num = 7

    if (num % 2 == 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }

    when{
        num % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    }
        //output num = 7 -> O numero é impar
        //output num = 20 -> O numero é par


    //ESTRUTURA DE DADOS E LOOP

    var array = IntArray(40)

    for (i in array.indices) {
        array[i] = i + 1
        println(array[i])
    }

    var lista: MutableList<Int> = mutableListOf(1)

    for (i in 0..99) {
        lista.add(i + 1)
        println(lista[i])
    }

    var soma = 0
    for (i in lista.indices) {
        soma += lista[i]
    }
    println("Resultado da soma dos numeros da lista: $soma")
}