package com.azimut.shopcomposeuiapp.models

import androidx.annotation.StringRes
import com.azimut.shopcomposeuiapp.R


sealed class Screen(val route: String, @StringRes val resourceId: Int){
    object Hand_bag : Screen("hand_bag", R.string.Hand_bag)
    object Jewellery : Screen("jewellery", R.string.Jewellery)
    object Footwear : Screen("footwear", R.string.Footwear)
    object Dresses : Screen("dresses", R.string.Dresses)

    object DetailsScreen : Screen("details_screen", R.string.DetailsScreen)
}