package com.example.eatwell.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation


@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Route.OnBoarding.screenName,
    finishActivity: () -> Unit
) {

    val actions = remember(navController) { MainActions(navController) }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable(Route.OnBoarding.screenName) {

        }
        composable(Route.SignUp.screenName) {

        }
        composable(Route.LogIn.screenName) {

        }
        navigation(
            route = Route.Home.screenName,
            startDestination = Tabs.SCAN.route
        ) {
            tabs()
        }

    }

}

class MainActions(navController: NavHostController) {
    val onBoardingComplete: (NavBackStackEntry) -> Unit = { from ->
        if (from.lifecycleIsResumed()) {
            navController.navigate(Route.SignUp.screenName)
        }
    }
}


private fun NavBackStackEntry.lifecycleIsResumed() =
    this.lifecycle.currentState == Lifecycle.State.RESUMED