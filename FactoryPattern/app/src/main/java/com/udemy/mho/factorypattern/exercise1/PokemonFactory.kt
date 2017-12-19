package com.udemy.mho.factorypattern.exercise1

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class PokemonFactory {
    fun getPokemon(type: PokemonType) = when(type){
        PokemonType.ELECTRIC -> Pikachi()
        PokemonType.FIRE -> Charmander()
        PokemonType.GRASS -> Bulbasaur()
        PokemonType.WATER -> Squirtle()
    }
}