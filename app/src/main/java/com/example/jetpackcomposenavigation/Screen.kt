package com.example.jetpackcomposenavigation

sealed class Screen(val route: String) {
    data object Home: Screen(route = "home_screen")
    data object Detail: Screen(route = "detail_screen")
    data object Settings: Screen(route = "settings_screen")
}