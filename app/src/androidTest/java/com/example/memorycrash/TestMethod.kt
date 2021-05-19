package com.example.memorycrash

import android.util.Log
import androidx.test.ext.junit.rules.ActivityScenarioRule
import java.nio.ByteBuffer

fun doTest(activityTestRule: ActivityScenarioRule<MainActivity>, no: Int) {
    Log.e("LOG", "Test number $no")
    repeat(1000) {
        ByteBuffer.allocate(300 * it)
    }
    activityTestRule.scenario.onActivity { }
}
