package com.udemy.mho.factorypattern

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class BreadFactory {
    fun getBread(breadType: String) : Bread?{
        return when (breadType) {
            "BAG" -> Baguette()
            "ROL" -> Roll()
            "SLI" -> Sliced()
            else -> null
        }
    }
}