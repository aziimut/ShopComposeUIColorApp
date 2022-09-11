package com.azimut.shopcomposeuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.azimut.shopcomposeuiapp.screens.HeaderScreen
import com.azimut.shopcomposeuiapp.ui.theme.ShopComposeUIAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShopComposeUIAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            backgroundColor = Color.White,
                            elevation = 0.dp
                        ) {
                            Row(modifier= Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(onClick = {}) {
                                    Icon(
                                        Icons.Filled.ArrowBack,
                                        "backIcon",
                                        modifier = Modifier.size(25.dp),
                                        tint = Color.Gray
                                    )
                                }
                                Row {
                                    IconButton(onClick = {}) {
                                        Icon(
                                            Icons.Filled.Search,
                                            "backIcon",
                                            modifier = Modifier.size(25.dp),
                                            tint = Color.Gray
                                        )
                                    }
                                    IconButton(onClick = {}) {
                                        Icon(
                                            Icons.Filled.ShoppingCart,
                                            "backIcon",
                                            modifier = Modifier.size(25.dp),
                                            tint = Color.Gray
                                        )
                                    }
                                }
                            }
                        }
                    }) {
                    HeaderScreen()
                }
            }
        }
    }
}

