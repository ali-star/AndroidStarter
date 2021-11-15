package alistar.android.starter.navigation

import alistar.android.started.features.home.ui.Home
import alistar.android.starter.core.navigation.Destinations
import alistar.android.starter.initializer.ui.get_started.GetStarted
import alistar.android.starter.initializer.ui.get_started.Login
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Destinations.GET_STARTED) {
        composable(route = Destinations.GET_STARTED) {
            GetStarted {
                navHostController.navigate(Destinations.LOGIN)
            }
        }
        composable(route = Destinations.LOGIN) {
            Login {
                navHostController.navigate(Destinations.HOME)π
            }
        }
        composable(route = Destinations.HOME) {
            Home {
                navHostController.navigate(Destinations.GET_STARTED)
            }
        }
    }
}