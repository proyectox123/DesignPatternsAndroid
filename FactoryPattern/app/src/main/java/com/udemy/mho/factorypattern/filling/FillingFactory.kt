package com.udemy.mho.factorypattern.filling

import com.udemy.mho.factorypattern.AbstractFactory
import com.udemy.mho.factorypattern.drink.Drink
import com.udemy.mho.factorypattern.bread.Bread

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

