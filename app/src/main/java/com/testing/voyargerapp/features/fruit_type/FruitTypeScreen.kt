package com.testing.voyargerapp.features.fruit_type

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.testing.voyargerapp.R

class FruitTypeScreen : Screen{


    @Composable
    override fun Content() {
        var currentIndex by remember { mutableStateOf(0) }
        val mainNavigator = LocalNavigator.currentOrThrow
        
        Navigator(screen = SweetFruitScreen(navigator = mainNavigator)) {
                navigator -> Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "Fruit Type") },
                        backgroundColor = Color.Blue,
                        contentColor = White
                    )
                },
                content = { CurrentScreen() },
                bottomBar = {
                    BottomAppBar(
                        backgroundColor = White
                    ) {
                        BottomNavigationItem(
                            selected = currentIndex == 0,
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_fruit),
                                    tint = Color.Red,
                                    contentDescription = ""
                                )
                            }, onClick = { navigator.replace(SweetFruitScreen(mainNavigator)) })
                        BottomNavigationItem(
                            selected = currentIndex == 1,
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_fruit),
                                    tint = Color.Green,
                                    contentDescription = ""
                                )
                            }, onClick = {navigator.replace(SourFruitScreen()) })

                    }
                }
            )
        }


    }


}