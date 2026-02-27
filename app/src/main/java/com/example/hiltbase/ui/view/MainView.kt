package com.example.hiltbase.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hiltbase.ui.composable.BottomBar
import com.example.hiltbase.ui.viewmodel.MainViewModel

@Composable
fun MainView(navController: NavHostController) {
    val viewModel: MainViewModel = hiltViewModel()
    Scaffold(
        bottomBar = { BottomBar(navController) }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Text("MainView")
        }
    }
}