package com.udemy.mho.factorypattern

import android.util.Log
import com.udemy.mho.factorypattern.ingredient.Ingredient

/**
 * Created by mauricio.hernandez on 21/12/2017.
 */
class Sandwich {

    companion object {
        val TAG : String = Sandwich::class.java.simpleName
    }

    private val ingredients: MutableList<Ingredient> = ArrayList()

    fun addIngredient(ingredient: Ingredient){
        ingredients.add(ingredient)
    }

    fun getCalories(){
        var calories = 0
        ingredients.forEach { calories += it.calories() }

        Log.e(TAG,"Total de calorías: $calories kcal")
    }

    fun getIngredients(){
        ingredients.forEach { Log.e(TAG,"${it.name()}: ${it.calories()} kcal") }
    }
}