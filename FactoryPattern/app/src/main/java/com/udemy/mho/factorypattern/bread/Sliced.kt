package com.udemy.mho.factorypattern.bread

class Sliced : Bread {
    override fun description() = "Este es un pan de pita"

    override fun image() = "R.drawable.sliced"

    override fun name() = "Pan de pita"

    override fun calories() = 169
}