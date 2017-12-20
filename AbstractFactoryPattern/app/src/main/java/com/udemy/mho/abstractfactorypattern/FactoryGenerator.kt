package com.udemy.mho.abstractfactorypattern

import com.udemy.mho.abstractfactorypattern.bread.BreadFactory
import com.udemy.mho.abstractfactorypattern.drink.DrinkFactory
import com.udemy.mho.abstractfactorypattern.filling.FillingFactory

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