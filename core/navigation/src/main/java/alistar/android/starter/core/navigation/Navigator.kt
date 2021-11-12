package alistar.android.starter.core.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class Navigator {

    private var navHostController: NavHostController? = null

    @Composable
    fun navigator(): NavHostController {
        if (navHostController == null)
            navHostController = rememberNavController()
        return navHostController!!
    }

    @Composable
    fun navigate(route: String) {
        navigator().navigate(route)
    }

    @Composable
    fun handleDeepLink(intent: Intent) {
        navigator().handleDeepLink(intent)
    }

    @Composable
    fun pop() {
        navigator().popBackStack()
    }

}
