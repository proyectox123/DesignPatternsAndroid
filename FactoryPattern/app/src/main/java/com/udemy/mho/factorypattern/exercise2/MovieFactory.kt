package com.udemy.mho.factorypattern.exercise2

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class MovieFactory {
    fun recommendMovieByGenre(genre: MovieGenre) = when(genre){
        MovieGenre.ACTION -> CasinoRoyale()
        MovieGenre.SCIFI -> Interstellar()
        MovieGenre.HORROR -> Psycho()
    }
}