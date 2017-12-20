package com.udemy.mho.abstractfactorypattern

class FillingFactory : AbstractFactory() {
    override fun getBread(breadType: String): Bread? {
        return null
    }

    override fun getFilling(fillingType: String): Filling? {
        return when (fillingType) {
            "CHE" -> Cheese()
            "TOM" -> Tomato()
            "HAM" -> Ham()
            else -> null
        }
    }
}