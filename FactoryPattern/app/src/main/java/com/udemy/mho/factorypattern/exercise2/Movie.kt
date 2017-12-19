package com.udemy.mho.factorypattern.exercise2

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */

enum class MovieGenre {
    ACTION, SCIFI, HORROR
}

sealed class Movie {
    abstract fun name(): String
    abstract fun durationInMinutes(): Int
    abstract fun genre(): MovieGenre
}

class Interstellar() : Movie(){
    override fun name() = "Interstellar"

    override fun durationInMinutes(): Int = 169

    override fun genre() = MovieGenre.SCIFI
}

class CasinoRoyale() : Movie(){
    override fun name() = "Casino Royale"

    override fun durationInMinutes(): Int = 145

    override fun genre() = MovieGenre.ACTION
}

class Psycho() : Movie(){
    override fun name() = "Psycho"

    override fun durationInMinutes(): Int = 109

    override fun genre() = MovieGenre.HORROR
}