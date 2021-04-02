package net.lachlanmckee.jetpack.navigation.hilt

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
  @get:Rule
  val composeRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun verifyNavigationAndViewModelPersistence() {
    composeRule.apply {
      // Feature 1
      onNodeWithText("Active Screen - Feature 1").assertIsDisplayed()
      onNodeWithText("Count: 0").assertIsDisplayed()
      onNodeWithText("Increment Count").performClick()
      onNodeWithText("Count: 1").assertIsDisplayed()
      onNodeWithText("Feature 2").performClick()

      // Feature 2
      onNodeWithText("Active Screen - Feature 2").assertIsDisplayed()
      onNodeWithText("Feature 1").performClick()

      // Feature 1
      onNodeWithText("Active Screen - Feature 1").assertIsDisplayed()
      onNodeWithText("Count: 1").assertIsDisplayed()
    }
  }
}
