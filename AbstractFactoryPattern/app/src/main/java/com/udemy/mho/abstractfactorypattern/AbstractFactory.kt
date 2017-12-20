package com.udemy.mho.abstractfactorypattern

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
abstract class AbstractFactory {
    abstract fun getBread(breadType: String) : Bread?
    abstract fun getFilling(fillinType: String) : Filling?
}

