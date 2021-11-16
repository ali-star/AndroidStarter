package alistar.android.starter.initializer.ui.get_started

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun GetStarted(onClick: () -> Unit) {
    var text by remember { mutableStateOf("Get Started") }
    Text(text, modifier = Modifier.clickable {
        text = "Get Compose"
    })
}

@Composable
fun Login(onLogin: () -> Unit) {
    Text("Login", modifier = Modifier.clickable {
        onLogin.invoke()
    })
}