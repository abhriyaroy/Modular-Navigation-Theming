package com.abhriya.samplemodularapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        dressCodeStyleId = R.style.AppThemeAccent
//        matchDressCode()
        if(accentTheme){
            setTheme(R.style.AppThemeAccent)
        } else {
            setTheme(R.style.AppTheme)
        }
        println("here")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object{
        var accentTheme = false
    }
}

