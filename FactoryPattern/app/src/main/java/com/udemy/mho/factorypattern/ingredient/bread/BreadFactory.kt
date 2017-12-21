package com.udemy.mho.factorypattern.ingredient.bread

import com.udemy.mho.factorypattern.AbstractFactory
import com.udemy.mho.factorypattern.drink.Drink
import com.udemy.mho.factorypattern.ingredient.filling.Filling

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