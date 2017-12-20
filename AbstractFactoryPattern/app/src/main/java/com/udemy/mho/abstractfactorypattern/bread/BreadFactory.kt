package com.udemy.mho.abstractfactorypattern.bread

import com.udemy.mho.abstractfactorypattern.AbstractFactory
import com.udemy.mho.abstractfactorypattern.drink.Drink
import com.udemy.mho.abstractfactorypattern.filling.Filling

class BreadFactory : AbstractFactory() {

    override fun getBread(breadType: String): Bread? {
        return when (breadType) {
            "BAG" -> Baguette()
            "ROL" -> Roll()
            "SLI" -> Sliced()
            else -> null
        }
    }

    override fun getDrink(drinkType: String): Drink? = null

    override fun getFilling(fillingType: String): Filling? = null
}