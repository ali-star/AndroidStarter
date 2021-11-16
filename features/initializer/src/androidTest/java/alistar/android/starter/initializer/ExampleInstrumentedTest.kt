package alistar.android.starter.initializer

import alistar.android.starter.initializer.ui.get_started.GetStarted
import alistar.android.starter.libraries.test.BaseRobot
import alistar.android.starter.libraries.test.dsl.GIVEN
import alistar.android.starter.libraries.test.dsl.RUN_UI_TEST
import alistar.android.starter.libraries.test.dsl.THEN
import androidx.activity.ComponentActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private val robot = Robot(composeTestRule)

    @Test
    fun shouldDisplayText() {
        RUN_UI_TEST(robot) {
            GIVEN { createGetStartedScreen() }
            THEN { checkTextIsDisplayed() }
        }
    }
}

class Robot(private val composeTestRule: AndroidComposeTestRule<*, *>): BaseRobot() {

    fun createGetStartedScreen() {
        composeTestRule.setContent {
            MaterialTheme {
                GetStarted {

                }
            }
        }
    }

    fun checkTextIsDisplayed() {
        composeTestRule.onNodeWithText("Get Started").assertIsDisplayed()
    }

}