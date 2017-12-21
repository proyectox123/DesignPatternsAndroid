package com.udemy.mho.factorypattern.drink

class Beer : Drink {
    override fun description() = "Una refrescante cerveza."

    override fun image() = "R.drawable.beer"

    override fun name() = "Cerveza"

    override fun calories() = 155
}