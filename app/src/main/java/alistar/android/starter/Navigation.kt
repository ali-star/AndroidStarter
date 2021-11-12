package alistar.android.starter

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink

@Composable
fun navHost(navController: NavHostController) {
    val uri = "app://alistar.android.starter"

    NavHost(navController = navController, startDestination = "home") {
        composable(
            route = "home",
            deepLinks = listOf(navDeepLink { uriPattern = uri })
        ) { Home(navController) }

        composable(
            route = "greeting",
            deepLinks = listOf(navDeepLink { uriPattern = "$uri/greeting" })
        ) { Greeting(name = "Navigation", navController) }
    }
}
