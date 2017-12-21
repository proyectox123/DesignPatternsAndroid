package com.udemy.mho.factorypattern.filling

interface Filling {
    fun name(): String
    fun description(): String
    fun calories(): Int
    fun image(): String
}