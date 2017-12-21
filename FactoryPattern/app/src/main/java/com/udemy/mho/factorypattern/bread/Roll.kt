package com.udemy.mho.factorypattern.bread

class Roll : Bread {
    override fun description() = "Este es un pan de molde"

    override fun image() = "R.drawable.roll"

    override fun name() = "Pan de molde"

    override fun calories() = 80
}