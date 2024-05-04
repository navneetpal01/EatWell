package com.example.eatwell.presentation.onboarding

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eatwell.R
import com.example.eatwell.ui.theme.NORMAL_GREEN
import com.example.eatwell.ui.theme.NORMAL_NEUTRAL_BLACK
import com.example.eatwell.ui.theme.stronglyDeemphasizedAlpha


@Composable
fun OnBoardingScreen(
    onClosedPressed : () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                pageIndex = 1,
                totalPages = 5,
                onClosedPressed = onClosedPressed
            )
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



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    pageIndex : Int,
    totalPages : Int,
    onClosedPressed : () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ){
        CenterAlignedTopAppBar(
            title = {
                TopAppBarTittle(
                    pageIndex = pageIndex,
                    totalPages = totalPages
                )
            },
            actions = {
                IconButton(
                    onClick = onClosedPressed
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = stringResource(id = R.string.close)
                    )
                }
            }
        )
        val animatedProgress by animateFloatAsState(
            targetValue = (pageIndex + 1) / totalPages.toFloat(),
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
        )
        LinearProgressIndicator(
            progress = animatedProgress,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            trackColor = NORMAL_GREEN
        )
    }
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
            color = NORMAL_NEUTRAL_BLACK.copy(alpha = stronglyDeemphasizedAlpha),
            fontSize = 10.sp,
            style = TextStyle(
                platformStyle = PlatformTextStyle(
                    includeFontPadding = false
                )
            )
        )
        Text(
            text = stringResource(id = R.string.page_count,totalPages),
            color = NORMAL_NEUTRAL_BLACK.copy(alpha = 0.38f),
            fontSize = 10.sp,
            style = TextStyle(
                platformStyle = PlatformTextStyle(
                    includeFontPadding = false
                )
            )
        )
    }
}