package com.udemy.mho.abstractfactorypattern.filling

import com.udemy.mho.abstractfactorypattern.AbstractFactory
import com.udemy.mho.abstractfactorypattern.drink.Drink
import com.udemy.mho.abstractfactorypattern.bread.Bread

class FillingFactory : AbstractFactory() {
    override fun getBread(breadType: String): Bread? = null

    override fun getDrink(drinkType: String): Drink? = null

    override fun getFilling(fillingType: String): Filling? {
        return when (fillingType) {
            "CHE" -> Cheese()
            "TOM" -> Tomato()
            "HAM" -> Ham()
            else -> null
        }
    }
}

