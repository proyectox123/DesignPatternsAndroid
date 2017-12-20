package com.udemy.mho.abstractfactorypattern

import com.udemy.mho.abstractfactorypattern.bread.Bread
import com.udemy.mho.abstractfactorypattern.drink.Drink
import com.udemy.mho.abstractfactorypattern.filling.Filling

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
abstract class AbstractFactory {
    abstract fun getBread(breadType: String) : Bread?
    abstract fun getDrink(drinkType: String) : Drink?
    abstract fun getFilling(fillingType: String) : Filling?
}

