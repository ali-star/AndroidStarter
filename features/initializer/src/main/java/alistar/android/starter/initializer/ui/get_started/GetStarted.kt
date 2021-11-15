package alistar.android.starter.initializer.ui.get_started

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GetStarted(onClick: () -> Unit) {
    Text("Get Started", modifier = Modifier.clickable {
        onClick.invoke()
    })
}

@Composable
fun Login(onLogin: () -> Unit) {
    Text("Login", modifier = Modifier.clickable {
        onLogin.invoke()
    })
}