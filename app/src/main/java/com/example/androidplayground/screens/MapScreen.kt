@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.androidplayground.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.arcgismaps.mapping.ArcGISMap
import com.arcgismaps.mapping.BasemapStyle
import com.arcgismaps.mapping.Viewpoint
import com.arcgismaps.toolkit.geoviewcompose.MapView
import com.example.androidplayground.R

@Composable
fun MapScreen() {
    val map = remember { createMap() }
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) }) }
    ) {
        MapView(modifier = Modifier.fillMaxSize().padding(it), arcGISMap = map)
    }
}

fun createMap(): ArcGISMap {
    return ArcGISMap(BasemapStyle.ArcGISStreets).apply{
        initialViewpoint = Viewpoint(34.056295, -117.195800, 16_000.0)
    }
}