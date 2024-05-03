package com.example.eatwell.presentation.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.eatwell.R


@Composable
fun OnBoardingScreen(
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            //TODO Top App Bar

        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {

            }
        },
        bottomBar = {
            //TODO Bottom App Bar

        }
    )

}

@Composable
fun TopAppBarTittle(
    pageIndex : Int,
    totalPages : Int,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
    ){
        Text(
            text = (pageIndex + 1).toString(),
            
        )
        Text(
            text = ""
        )
    }
}