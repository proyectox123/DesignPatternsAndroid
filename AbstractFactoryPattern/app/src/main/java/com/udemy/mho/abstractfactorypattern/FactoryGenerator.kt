package com.udemy.mho.abstractfactorypattern

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class FactoryGenerator {

    companion object {
        fun getFactory(factoryType: String) : AbstractFactory?{
            return when (factoryType) {
                "BRE" -> BreadFactory()
                "FIL" -> FillingFactory()
                else -> null
            }
        }
    }
}