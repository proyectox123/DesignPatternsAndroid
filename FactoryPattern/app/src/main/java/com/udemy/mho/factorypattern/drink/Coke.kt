package com.udemy.mho.factorypattern.drink

class Coke : Drink {
    override fun description() = "Una refrescante Coca-Cola"

    override fun image() = "R.drawable.coke"

    override fun name() = "Coca-Cola"

    override fun calories() = 150
}