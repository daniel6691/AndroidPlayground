package com.example.androidplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.androidplayground.screens.MapScreen
import com.example.androidplayground.ui.theme.AndroidPlaygroundTheme
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setApiKey()
        setContent {
            AndroidPlaygroundTheme{
                MapScreen()
             }
        }
    }

    private fun setApiKey(){
        ArcGISEnvironment.apiKey = ApiKey.create(resources.getString(R.string.api_key))
    }
}