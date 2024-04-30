package com.example.eatwell.presentation.nvgraph

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.eatwell.R


fun NavGraphBuilder.tabs() {

    composable(Tabs.DASHBOARD.route){

    }
    composable(Tabs.SEARCH.route){

    }
    composable(Tabs.SCAN.route){

    }
    composable(Tabs.STATS.route){

    }
    composable(Tabs.MORE.route){

    }
}


enum class Tabs(
    @SuppressLint("SupportAnnotationUsage") @StringRes val title: String,
    @DrawableRes val icon: Int,
    val route: String
) {
    DASHBOARD(title = "Dashboard", R.drawable.ic_launcher_foreground,TabsDestination.DASHBOARD_ROUTE),
    SEARCH(title = "Search",R.drawable.ic_launcher_foreground,TabsDestination.SEARCH_ROUTE),
    SCAN(title = "Scan",R.drawable.ic_launcher_foreground,TabsDestination.SCAN_ROUTE),
    STATS(title = "Stats",R.drawable.ic_launcher_foreground,TabsDestination.STATS_ROUTE),
    MORE(title = "More",R.drawable.ic_launcher_foreground,TabsDestination.MORE_ROUTE)
}


private object TabsDestination {
    const val DASHBOARD_ROUTE = "Tabs/dashboard"
    const val SEARCH_ROUTE = "Tabs/search"
    const val SCAN_ROUTE = "Tabs/scan"
    const val STATS_ROUTE = "Tabs/stats"
    const val MORE_ROUTE = "Tabs/more"
}