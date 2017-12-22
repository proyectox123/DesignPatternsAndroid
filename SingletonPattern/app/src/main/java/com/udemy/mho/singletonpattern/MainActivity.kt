package com.udemy.mho.singletonpattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.toolbar.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    private fun initToolbar(){
        toolbar?.let{
            setSupportActionBar(it)
            with(it){
                title = context.getString(R.string.toolbar_title)
                subtitle = context.getString(R.string.toolbar_subtitle)
            }
        }
    }
}
