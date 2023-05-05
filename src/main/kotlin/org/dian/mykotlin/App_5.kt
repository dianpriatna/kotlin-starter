package org.dian.mykotlin

fun main() {
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

/*
    Output:
        Vocal A
        Vocal B
        Vocal C
        Vocal D
        Vocal C
        Vocal B
        Vocal A

*/