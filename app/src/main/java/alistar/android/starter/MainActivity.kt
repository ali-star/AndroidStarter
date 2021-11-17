package alistar.android.starter

import alistar.android.starter.navigation.Navigation
import alistar.android.starter.ui.theme.AndroidStarterTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStarterTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navHostController = rememberNavController()
                    Navigation(navHostController = navHostController)
                }
            }
        }
    }
}