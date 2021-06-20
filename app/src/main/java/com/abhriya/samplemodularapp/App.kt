package com.abhriya.samplemodularapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import daio.io.dresscode.DressCode
import daio.io.dresscode.declareDressCode
import io.multimoon.colorful.Defaults
import io.multimoon.colorful.ThemeColor
import io.multimoon.colorful.initColorful

@HiltAndroidApp
class App : Application(){
    override fun onCreate() {
        declareDressCode(
            DressCode("themeone", R.style.AppTheme),
            DressCode("themetwo", R.style.AppThemeAccent))
        super.onCreate()
    }
}