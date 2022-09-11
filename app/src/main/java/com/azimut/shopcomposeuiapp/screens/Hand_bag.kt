package com.azimut.shopcomposeuiapp.screens

import android.content.Intent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.azimut.shopcomposeuiapp.details.DetailsScreen
import com.azimut.shopcomposeuiapp.models.productsList




@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Hand_bag(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val products = productsList()

    LazyVerticalGrid(
        cells =  GridCells.Fixed(2),
        //cells = GridCells.Adaptive(160.dp),
        contentPadding = PaddingValues(all = 20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        content = {
            items(products.size){ index ->

                Column(modifier.clickable(onClick = {
                    context.startActivity(Intent(context,DetailsScreen::class.java))
                })) {
                    Card(
                        modifier
                            //.width(160.dp)
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(RoundedCornerShape(15.dp)),
                        backgroundColor = products[index].color
                    ) {
                        Image(
                            painter = products[index].image,
                            contentDescription = products[index].title,
                            modifier.padding(20.dp)
                        )
                    }
                    Column {
                        Text(products[index].title,
                            color = Color.Gray)
                        Text(text = "${products[index].price}$",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    )
}