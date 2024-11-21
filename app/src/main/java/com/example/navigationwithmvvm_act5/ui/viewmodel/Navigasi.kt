package com.example.navigationwithmvvm_act5.ui.viewmodel

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.view.MenuHost
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

enum class Halaman{
    Form,
    Data
}

@Composable
fun Navigasi(
    modifier: Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {
    Scaffold { isipadding ->
        val uiState by viewModel.dataModel.collectAsState()



    }





}