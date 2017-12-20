package com.udemy.mho.abstractfactorypattern.drink

import com.udemy.mho.abstractfactorypattern.AbstractFactory
import com.udemy.mho.abstractfactorypattern.bread.Bread
import com.udemy.mho.abstractfactorypattern.filling.Filling

class DrinkFactory : AbstractFactory() {
    override fun getBread(breadType: String): Bread? = null

    override fun getDrink(drinkType: String): Drink? {
        return when (drinkType) {
            "COK" -> Coke()
            "BEE" -> Beer()
            else -> null
        }
    }

    override fun getFilling(fillingType: String): Filling? = null
}