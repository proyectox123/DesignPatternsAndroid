package com.udemy.mho.factorypattern.ingredient.bread

import com.udemy.mho.factorypattern.ingredient.Ingredient

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
abstract class Bread : Ingredient {
    override abstract fun name(): String
    override abstract fun description(): String
    override abstract fun calories(): Int
    override abstract fun image(): String
}