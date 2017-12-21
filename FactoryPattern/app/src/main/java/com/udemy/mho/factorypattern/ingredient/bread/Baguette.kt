package com.udemy.mho.factorypattern.ingredient.bread

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class Baguette : Bread() {
    override fun description() = "Un baguette recién hecha y muy crujiente"

    override fun image() = "R.drawable.baguette"

    override fun name() = "Baguette"

    override fun calories() = 250
}