package com.testing.voyargerapp.features.fruit_type

import android.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.testing.voyargerapp.features.fruit_detail.FruitDetailScreen


data class SweetFruitScreen(val navigator: Navigator) : Screen{
    @Composable
    override fun Content() {
        val navigator = navigator
        Scaffold() {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            TextButton(
                onClick = {
                    navigator.push(FruitDetailScreen(name = "Apple"))
            }) {
                Text(text = "Apple")
            }
        }

    }

    }

}



//@Composable
//fun FruitScreen(){
//    Scaffold(
//        topBar = {
//            TopAppBar(title = { Text(text = "Fruit") }, backgroundColor = Blue, contentColor = White)
//        }
//
//    ) {
//
//        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//            TextButton(
//                onClick = {
//
//            }) {
//                Text(text = "Apple")
//            }
//        }
//
//    }
//
//}