package com.udemy.mho.factorypattern.exercise1

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */

enum class PokemonType{
    ELECTRIC, FIRE, GRASS, WATER
}

sealed class Pokemon{
    abstract fun name(): String
    abstract fun type(): PokemonType
}

class Bulbasaur : Pokemon(){
    override fun name(): String = "Bulbasaur"

    override fun type() = PokemonType.GRASS
}

class Charmander : Pokemon(){
    override fun name(): String = "Charmander"

    override fun type() = PokemonType.FIRE
}

class Squirtle: Pokemon(){
    override fun name(): String = "Squirtle"

    override fun type() = PokemonType.WATER
}

class Pikachi: Pokemon(){
    override fun name(): String = "Pikachi"

    override fun type() = PokemonType.ELECTRIC
}