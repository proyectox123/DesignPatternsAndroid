package com.udemy.mho.factorypattern

import com.udemy.mho.factorypattern.ingredient.bread.BreadFactory
import com.udemy.mho.factorypattern.drink.DrinkFactory
import com.udemy.mho.factorypattern.ingredient.filling.FillingFactory

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class FactoryGenerator {

    companion object {
        fun getFactory(factoryType: String) : AbstractFactory?{
            return when (factoryType) {
                "BRE" -> BreadFactory()
                "FIL" -> FillingFactory()
                "DRI" -> DrinkFactory()
                else -> null
            }
        }
    }
}