package com.example.jetpackcomposenavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "Home Screen",
                fontSize = 40.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,
            )

            Row {
                Button(onClick = {
                    navController.navigate(route = Screen.Detail.route)
                }) {
                    Text(text = "Detail Screen")
                }
                Spacer(modifier = Modifier.size(10.dp))
                Button(onClick = {
                    navController.navigate(route = Screen.Settings.route)
                }) {
                    Text(text = "Settings Screen")
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}