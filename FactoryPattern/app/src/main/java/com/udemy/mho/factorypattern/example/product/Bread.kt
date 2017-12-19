package com.udemy.mho.factorypattern.example.product

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
sealed class Bread {
    abstract fun name(): String
    abstract fun calories(): String
}

class Roll : Bread() {
    override fun name() = "Pan de pita"

    override fun calories() = " : 169 kCal"
}

class Sliced : Bread() {
    override fun name() = "Pan de molde"

    override fun calories() = " : 80 kCal"
}

class Baguette : Bread() {
    override fun name() = "Baguette"

    override fun calories() = " : 250 kCal"
}