package com.udemy.mho.factorypattern

import com.udemy.mho.factorypattern.ingredient.Ingredient
import com.udemy.mho.factorypattern.ingredient.bread.Sliced
import com.udemy.mho.factorypattern.ingredient.filling.Cheese
import com.udemy.mho.factorypattern.ingredient.filling.Ham

/**
 * Created by mauricio.hernandez on 21/12/2017.
 */
class SandwichBuilder {

    companion object {
        fun cheeseAndHam() : Sandwich {
            val sandwich = Sandwich()
            sandwich.addIngredient(Sliced())
            sandwich.addIngredient(Ham())
            sandwich.addIngredient(Cheese())

            return sandwich
        }

        fun build(sandwich: Sandwich, ingredient: Ingredient) : Sandwich{
            sandwich.addIngredient(ingredient)
            return sandwich
        }
    }
}