package com.udemy.mho.factorypattern

import com.udemy.mho.factorypattern.bread.Bread
import com.udemy.mho.factorypattern.drink.Drink
import com.udemy.mho.factorypattern.filling.Filling

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
abstract class AbstractFactory {
    abstract fun getBread(breadType: String) : Bread?
    abstract fun getDrink(drinkType: String) : Drink?
    abstract fun getFilling(fillingType: String) : Filling?
}

