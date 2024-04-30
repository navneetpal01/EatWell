package com.example.eatwell

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.eatwell.presentation.nvgraph.NavGraph
import com.example.eatwell.presentation.nvgraph.Tabs
import com.example.eatwell.ui.theme.EatWellTheme
import com.example.eatwell.ui.theme.NORMAL_NEUTRAL_WHITE


@Composable
fun EatWellApp(
    finishActivity: () -> Unit
) {

    EatWellTheme {
        val tabs = remember { Tabs.values() }
    }
    val navController = rememberNavController()


    Scaffold(
        containerColor = NORMAL_NEUTRAL_WHITE
    ) { paddingValues ->
        NavGraph(
            modifier = Modifier
                .padding(paddingValues),
            navController = navController,
            finishActivity = finishActivity
        )
    }

}

@Composable
fun BottomBar(){

}