package com.sdsmdg.aridj.popoutnavigationdrawer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sdsmdg.aridj.lib.PopOutNavBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Sample App"

        val menus = ArrayList<Int>()
        menus.add(R.drawable.ic_archive_black_24dp)
        menus.add(R.drawable.ic_apps_black_24dp)
        menus.add(R.drawable.ic_border_color_black_24dp)
        menus.add(R.drawable.ic_build_black_24dp)
        // for demo
        PopOutNavBuilder(this, toolbar)
                .withMenus(menus)
                .build()
    }
}
