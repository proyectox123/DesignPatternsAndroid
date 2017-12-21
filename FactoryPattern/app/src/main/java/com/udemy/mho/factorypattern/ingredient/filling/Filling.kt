package com.udemy.mho.factorypattern.ingredient.filling

import com.udemy.mho.factorypattern.ingredient.Ingredient

abstract class Filling : Ingredient {
    override abstract fun name(): String
    override abstract fun description(): String
    override abstract fun calories(): Int
    override abstract fun image(): String
}