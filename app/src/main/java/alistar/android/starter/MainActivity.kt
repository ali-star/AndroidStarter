package alistar.android.starter

import alistar.android.starter.core.navigation.Navigator
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import alistar.android.starter.ui.theme.AndroidStarterTheme
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStarterTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    navHost(navigator.navigator())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, navController: NavHostController) {
    Text(text = "Hello $name!")
}

@Composable
fun Home(navController: NavHostController) {
    Text(text = "Home", modifier = Modifier.clickable {
        navController.navigate("intro")
    })
}