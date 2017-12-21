package com.udemy.mho.factorypattern.ingredient.filling

class Ham : Filling() {
    override fun description() = "Jamón!!!"

    override fun image() = "R.drawable.ham"

    override fun name() = "Jamón"

    override fun calories() = 194
}