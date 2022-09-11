package com.azimut.shopcomposeuiapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.azimut.shopcomposeuiapp.models.Screen


@Composable
fun HeaderScreen(modifier: Modifier = Modifier) {
    Column {
        Row(modifier.padding(start = 12.dp)) {
            Text(
                text = "Women", style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )
        }
        Row {
            MyAppNavHost()
        }
    }
}

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Hand_bag.route
) {
    val items = listOf(
        Screen.Hand_bag,
        Screen.Jewellery,
        Screen.Footwear,
        Screen.Dresses
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Column{
        Row(modifier.padding(start = 10.dp)) {
            items.forEach { item ->
                val selected = currentRoute == item.route
                Column {
                    TextButton(
                        onClick = { navController.navigate(item.route) }
                    ) {
                        Text(
                            text = stringResource(id = item.resourceId),
                            color = if (selected) Color.Black else Color.Gray,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                    if (selected) Box(
                        modifier
                            .height(2.dp)
                            .width(50.dp)
                            .offset(y = (-10).dp)
                            .padding(start = 10.dp)
                            .background(Color.Black)
                    )
                }
            }
        }
        NavHost(navController, startDestination, modifier) {
            composable(Screen.Hand_bag.route) {
                Hand_bag()
            }
            composable(Screen.Jewellery.route) {
                Jewellery()
            }
            composable(Screen.Footwear.route) {
                Footwear()
            }
            composable(Screen.Dresses.route) {
                Dresses()
            }
        }
    }
}
