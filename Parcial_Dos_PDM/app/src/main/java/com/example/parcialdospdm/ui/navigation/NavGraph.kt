package com.example.parcialdospdm.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.parcialdospdm.ui.screens.MainScreen
import com.example.parcialdospdm.ui.screens.PlaylistScreen
import com.example.parcialdospdm.ui.screens.SearchScreen
import com.example.parcialdospdm.ui.screens.SongScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = "main"
    ) {

        composable("main") {
            MainScreen(navController)
        }

        composable("search") {
            SearchScreen(navController)
        }

        composable("playlist") {
            PlaylistScreen(navController)
        }

        composable("song") {
            SongScreen(navController)
        }
    }
}