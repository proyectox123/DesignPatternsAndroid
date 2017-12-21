package com.udemy.mho.factorypattern.bread

/**
 * Created by mauricio.hernandez on 19/12/2017.
 */
interface Bread {
    fun name(): String
    fun description(): String
    fun calories(): Int
    fun image(): String
}