package com.example.jetpackcomposenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposenavigation.DetailScreen
import com.example.jetpackcomposenavigation.HomeScreen
import com.example.jetpackcomposenavigation.Screen
import com.example.jetpackcomposenavigation.SettingsScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Detail.route) {
            DetailScreen()
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }

}