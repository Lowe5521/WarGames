package com.jonkoester.wargames

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainMenuTest {
    @Rule
    @JvmField
    var activityRule = IntentsTestRule<MainMenu>(MainMenu::class.java)

    @Test
    fun navigateToNumberWar() {
        onView(withId(R.id.number_war_btn))
                .perform(click())

        intended(hasComponent(NumberWar::class.java.name))
    }
}