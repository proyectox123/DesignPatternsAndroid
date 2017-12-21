package com.udemy.mho.factorypattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.udemy.mho.factorypattern.ingredient.bread.Baguette
import com.udemy.mho.factorypattern.ingredient.filling.Cheese
import com.udemy.mho.factorypattern.ingredient.filling.Tomato

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = SandwichBuilder()

        createFirstSandwich(builder)
        createSecondSandwich(builder)
        createThirdSandwich(builder)
    }

    private fun createFirstSandwich(builder: SandwichBuilder){
        val s1 = builder.cheeseAndHam()
        printInfo("First sandwich", s1)
    }

    private fun createSecondSandwich(builder: SandwichBuilder){
        val s2 = builder.cheeseAndHam()
        builder.build(s2, Tomato())

        printInfo("Second sandwich", s2)
    }

    private fun createThirdSandwich(builder: SandwichBuilder){
        val s3 = Sandwich()
        builder.build(s3, Baguette())
        builder.build(s3, Cheese())
        builder.build(s3, Cheese())
        builder.build(s3, Tomato())

        printInfo("Third sandwich", s3)
    }

    private fun printInfo(label: String, sandwich: Sandwich){
        Log.e(TAG, label)
        sandwich.getIngredients()
        sandwich.getCalories()
    }
}