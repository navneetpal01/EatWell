package com.example.eatwell.presentation.nvgraph




sealed class Route(
    val screenName : String
){
    object OnBoarding : Route(screenName = "OnBoardingScreen")
    object SignUp : Route(screenName = "SignUpScreen")
    object LogIn : Route(screenName = "LogInScreen")
    object Home : Route(screenName = "HomeScreen")
}