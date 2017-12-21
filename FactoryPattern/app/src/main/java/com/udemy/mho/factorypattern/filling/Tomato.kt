package com.udemy.mho.factorypattern.filling

class Tomato : Filling {
    override fun description() = "Frescos tomates"

    override fun image() = "R.drawable.tomato"

    override fun name() = "Tomate"

    override fun calories() = 20
}