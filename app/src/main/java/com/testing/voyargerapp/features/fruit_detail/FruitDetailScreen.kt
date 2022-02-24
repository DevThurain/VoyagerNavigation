package com.testing.voyargerapp.features.fruit_detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.testing.voyargerapp.features.fruit.FruitScreen
import com.testing.voyargerapp.R


data class FruitDetailScreen(val name: String) : Screen {



    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                                     IconButton(
                                         onClick = {
                                             navigator.pop()
                                         }
                                     ){
                                         Icon(painter = painterResource(id = R.drawable.ic_back), contentDescription = "")
                                     }
                    },
                    title = { Text(text = "Fruit Detail") },
                    backgroundColor = Color.Blue, contentColor = Color.White)
            }

        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                Text(text = "${name}\'s Detail")
            }

        }    }

}



//@Composable
//fun FruitDetailScreen(){
//    Scaffold(
//        topBar = {
//            TopAppBar(title = { Text(text = "Fruit Detail") }, backgroundColor = Color.Blue, contentColor = Color.White)
//        }
//
//    ) {
//
//    }
//
//}