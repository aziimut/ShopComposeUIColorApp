package com.azimut.shopcomposeuiapp.details

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.azimut.shopcomposeuiapp.MainActivity
import com.azimut.shopcomposeuiapp.R
import com.azimut.shopcomposeuiapp.models.productsList


import com.azimut.shopcomposeuiapp.ui.theme.Details
import com.azimut.shopcomposeuiapp.ui.theme.Product1

class DetailsScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val products = productsList()
            val context = LocalContext.current
            Details {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = products[0].color,
                    topBar = {
                        TopAppBar(
                            backgroundColor = Product1,
                            elevation = 0.dp
                        ) {
                            Row(modifier= Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(onClick = {
                                    context.startActivity(Intent(context,MainActivity::class.java))
                                }) {
                                    Icon(
                                        Icons.Filled.ArrowBack,
                                        "backIcon",
                                        modifier = Modifier.size(25.dp),
                                        tint = Color.White
                                    )
                                }
                                Row {
                                    IconButton(onClick = {}) {
                                        Icon(
                                            Icons.Filled.Search,
                                            "backIcon",
                                            modifier = Modifier.size(25.dp),
                                            tint = Color.White
                                        )
                                    }
                                    IconButton(onClick = {}) {
                                        Icon(
                                            Icons.Filled.ShoppingCart,
                                            "backIcon",
                                            modifier = Modifier.size(25.dp),
                                            tint = Color.White
                                        )
                                    }
                                }
                            }
                        }
                    }) {

                }
            }
        }
    }
}

