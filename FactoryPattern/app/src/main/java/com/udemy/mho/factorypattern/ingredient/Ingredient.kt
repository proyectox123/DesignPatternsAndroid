package com.udemy.mho.factorypattern.ingredient

/**
 * Created by mauricio.hernandez on 21/12/2017.
 */
interface Ingredient {
    fun name(): String
    fun description(): String
    fun calories(): Int
    fun image(): String
}