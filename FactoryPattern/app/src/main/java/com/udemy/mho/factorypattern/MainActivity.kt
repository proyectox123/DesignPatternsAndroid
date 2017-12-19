package com.udemy.mho.factorypattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.udemy.mho.factorypattern.example.creator.BreadFactory
import com.udemy.mho.factorypattern.example.product.Baguette
import com.udemy.mho.factorypattern.example.product.Roll
import com.udemy.mho.factorypattern.example.product.Sliced
import com.udemy.mho.factorypattern.exercise1.PokemonFactory
import com.udemy.mho.factorypattern.exercise1.PokemonType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exampleBread()
        examplePokemon()
    }

    private fun exampleBread(){
        val breadFactory = BreadFactory()
        text_view.text = StringBuilder()
                .append(breadFactory.getBread(Baguette()).name())
                .append("\n")
                .append(breadFactory.getBread(Roll()).name())
                .append("\n")
                .append(breadFactory.getBread(Sliced()).name())
                .toString()

        Log.d(TAG, breadFactory.getBread(Sliced()).name())
    }

    private fun examplePokemon(){
        val pokemonFactory = PokemonFactory()
        text_view.text = StringBuilder()
                .append("Suggest pokemon with type ${PokemonType.ELECTRIC}: ")
                .append(pokemonFactory.getPokemon(PokemonType.ELECTRIC).name())
                .append("\n")
                .append("Suggest pokemon with type ${PokemonType.FIRE}: ")
                .append(pokemonFactory.getPokemon(PokemonType.FIRE).name())
                .append("\n")
                .append("Suggest pokemon with type ${PokemonType.GRASS}: ")
                .append(pokemonFactory.getPokemon(PokemonType.GRASS).name())
                .append("\n")
                .append("Suggest pokemon with type ${PokemonType.WATER}: ")
                .append(pokemonFactory.getPokemon(PokemonType.WATER).name())
                .toString()
    }
}