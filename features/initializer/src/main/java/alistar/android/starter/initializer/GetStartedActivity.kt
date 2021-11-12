package alistar.android.starter.initializer

import alistar.android.starter.core.navigation.Navigator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import javax.inject.Inject

class GetStartedActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navHost(navigator.navigator())
        }
    }
}

@Composable
fun intro() {
    Text("Intro")
}