package com.udemy.mho.factorypattern.filling

class Cheese : Filling {
    override fun description() = "Delicioso queso manchego"

    override fun image() = "R.drawable.cheese"

    override fun name() = "Queso"

    override fun calories() = 52
}