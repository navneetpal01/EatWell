package com.example.eatwell.presentation.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun OnBoardingScreen(
    content : @Composable (PaddingValues) -> Unit
){
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {

        },
        content = content,
        bottomBar = {

        }
    )

}