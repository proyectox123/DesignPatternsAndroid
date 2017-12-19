package com.udemy.mho.factorypattern.example.creator

import com.udemy.mho.factorypattern.example.product.Bread
import com.udemy.mho.factorypattern.example.product.Baguette
import com.udemy.mho.factorypattern.example.product.Roll
import com.udemy.mho.factorypattern.example.product.Sliced

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
class BreadFactory {
//    fun getBread(breadType: String) : Bread?{
//        return when (breadType) {
//            "BAG" -> Baguette()
//            "ROL" -> Roll()
//            "SLI" -> Sliced()
//            else -> null
//        }
//    }

    fun getBread(breadType: Bread) = when (breadType) {
        is Roll -> Roll()
        is Sliced -> Sliced()
        is Baguette -> Baguette()
    }
}