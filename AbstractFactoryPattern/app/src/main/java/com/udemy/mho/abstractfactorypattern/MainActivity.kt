package com.udemy.mho.abstractfactorypattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fillingFactory = FactoryGenerator.getFactory("FIL")
        fillingFactory?.let {
            val filling = fillingFactory.getFilling("TOM")
            filling?.let {
                Log.d(TAG, "Filling ${filling.name()}${filling.calories()}")
            }
        }

        val breadFactory = FactoryGenerator.getFactory("BRE")
        breadFactory?.let {
            val bread = breadFactory.getBread("BAG")
            bread?.let {
                Log.d(TAG, "Bread ${bread.name()}${bread.calories()}")
            }
        }

        val drinkFactory = FactoryGenerator.getFactory("DRI")
        drinkFactory?.let {
            val drink = drinkFactory.getDrink("BEE")
            drink?.let {
                Log.d(TAG, "Bread ${drink.name()}${drink.calories()}")
            }
        }
    }
}