package jp.kirin3.junit

import android.support.test.rule.ActivityTestRule
import org.hamcrest.Matchers
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule



class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun isValid() {
    }

    // アクティビティ起動に必要なJUnit4のRuleを使用
    @Rule
    var activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun check_start_activity() {
        val activity = activityTestRule.launchActivity(null)
        assertThat(
            "MainActivity is running",
            activity.isFinishing,
            Matchers.`is`(false)
        )
    }

}