package alistar.android.starter.initializer

import alistar.android.starter.initializer.ui.get_started.GetStarted
import alistar.android.starter.libraries.test.BaseRobot
import alistar.android.starter.libraries.test.dsl.GIVEN
import alistar.android.starter.libraries.test.dsl.RUN_UI_TEST
import alistar.android.starter.libraries.test.dsl.THEN
import alistar.android.starter.libraries.test.dsl.WHEN
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.*
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val robot = Robot(composeTestRule)

    @Test
    fun shouldDisplayText() {
        RUN_UI_TEST(robot) {
            GIVEN { createGetStartedScreen() }
            WHEN { clickingOnGetStartedButton() }
            THEN { checkTextIsDisplayed() }
        }
    }
}

class Robot(private val composeTestRule: ComposeContentTestRule): BaseRobot() {

    fun createGetStartedScreen() {
        composeTestRule.setContent {
            MaterialTheme {
                GetStarted {

                }
            }
        }
    }

    fun checkTextIsDisplayed() {
        composeTestRule.onNodeWithText("Get Compose").assertIsDisplayed()
    }

    fun clickingOnGetStartedButton() {
        composeTestRule.onNodeWithText("Get Started").performClick()
    }

}