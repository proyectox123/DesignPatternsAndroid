package com.udemy.mho.abstractfactorypattern

class BreadFactory : AbstractFactory() {
    override fun getBread(breadType: String): Bread? {
        return when (breadType) {
            "BAG" -> Baguette()
            "ROL" -> Roll()
            "SLI" -> Sliced()
            else -> null
        }
    }

    override fun getFilling(fillinType: String): Filling? {
        return null
    }
}