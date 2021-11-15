package alistar.android.started.features.home.ui

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(onCLick: () -> Unit) {
    Text("Home", modifier = Modifier.clickable {
        onCLick.invoke()
    })
}