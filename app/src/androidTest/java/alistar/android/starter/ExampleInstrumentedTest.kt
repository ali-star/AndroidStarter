package alistar.android.starter

import alistar.android.starter.libraries.test.BaseRobot
import alistar.android.starter.libraries.test.dsl.GIVEN
import alistar.android.starter.libraries.test.dsl.RUN_UI_TEST
import alistar.android.starter.libraries.test.dsl.THEN
import alistar.android.starter.navigation.Navigation
import alistar.android.starter.ui.theme.AndroidStarterTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.rememberNavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    private val robot = Robot(composeTestRule)

    @Test
    fun uiTest() {
        RUN_UI_TEST(robot) {
            GIVEN { createActivity() }
            THEN { checkTextIsDisplayed() }
        }
    }

}

class Robot(private val composeTestRule: AndroidComposeTestRule<*, *>): BaseRobot() {

    fun createActivity() {
        composeTestRule.setContent {
            AndroidStarterTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navHostController = rememberNavController()
                    Navigation(navHostController = navHostController)
                }
            }
        }
    }

    fun checkTextIsDisplayed() {
        composeTestRule.onNodeWithText("Get Started").assertExists()
    }

}