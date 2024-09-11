package com.nico.studies

fun main(){

    //Crie uma lista com os números inteiro de 1 a 99, filtre os numeros pares da lista original
    var list: MutableList<Int> = mutableListOf()
    for (i in 1..99) {
        list.add(i)
    }
    var filteredList = list.filter { it % 2 == 0 }
    println(filteredList)


    //Crie uma lista de string com 4 nomes
    var stringList = listOf("Joao", "Maria", "Solange", "Caio")
    var helloList = stringList.map { "Olá $it" }
    helloList.forEach{ println(it) }
    //


    //testes funcoes: soma, compacta e de ordem superior
    var sum = soma(7, 6)
    println(sum)


    var comp = funCompacta(5,100)
    println(comp)


    var calcFun = calc(14, 22, ::soma)
    var multFun = calc(14, 22, ::funCompacta)

    println(calcFun)
    println(multFun)


}


//Crie uma função que receba dois números inteiro de parâmetro e retorne o resultado da soma
fun soma(a: Int, b: Int) : Int{
    return a + b
}

//Crie uma função compacta que receba dois números inteiros de parâmetro e retorne o resultado da multiplicação deles
fun funCompacta(a: Int, b: Int) = a * b

//Crie uma função calculadora que recebe dois inteiros de parâmetro e um terceiro parâmetro do tipo função. Esta função de parâmetro deve receber dois inteiros de parâmetro e retornar um inteiro
fun calc(a: Int, b: Int, op: (Int, Int) -> Int): Int{
   return op(a, b)
}