package com.udemy.mho.factorypattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBread()
    }

    private fun createBread(){
        val breadFactory = BreadFactory()
        text_view.text = StringBuilder()
                .append(breadFactory.getBread("BAG")?.name())
                .append("\n")
                .append(breadFactory.getBread("ROL")?.name())
                .append("\n")
                .append(breadFactory.getBread("SLI")?.name())
                .toString()

        Log.d(TAG, breadFactory.getBread("SLI")?.name())
    }
}
