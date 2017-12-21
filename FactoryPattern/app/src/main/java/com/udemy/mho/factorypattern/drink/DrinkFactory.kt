package com.udemy.mho.factorypattern.drink

import com.udemy.mho.factorypattern.AbstractFactory
import com.udemy.mho.factorypattern.bread.Bread
import com.udemy.mho.factorypattern.filling.Filling

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