package com.azimut.shopcomposeuiapp.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.azimut.shopcomposeuiapp.R
import com.azimut.shopcomposeuiapp.ui.theme.*

@Composable
fun productsList(): List<Product>{
    return listOf(
        Product(
            1,
            "Office Code",
            234,
            12,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_1),
            Product1
        ),
        Product(
            2,
            "Belt Bag",
            234,
            8,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_2),
            Product2
        ),
        Product(
            3,
            "Hang Top",
            234,
            10,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_3),
            Product3
        ),
        Product(
            4,
            "Old Fashion",
            234,
            11,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_4),
            Product4
        ),
        Product(
            5,
            "Office Code",
            234,
            12,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_5),
            Product5
        ),
        Product(
            6,
            "Office Code",
            234,
            12,
            stringResource(R.string.dummyText),
            painterResource(R.drawable.bag_6),
            Product6,
        ),
    )
}