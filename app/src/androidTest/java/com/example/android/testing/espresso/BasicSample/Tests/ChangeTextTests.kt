package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.Data.Constants
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Steps.ActivityPageSteps
import com.example.android.testing.espresso.BasicSample.Steps.ChangeTextPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun changeTextTest(){
        with(ChangeTextPageSteps){
            inputText(Constants.MY_NAME)
                .clickChangeTextBtn()
                .validateText(Constants.MY_NAME);
        }
    }

    @Test
    fun activityBtnTest(){
        ChangeTextPageSteps
            .inputText(Constants.FIRST_FILM)
            .clickChangeTextBtn()
            .validateText(Constants.FIRST_FILM)
            .clearTextField()
            .inputText(Constants.SECOND_FILM)
            .clickActivityChangeTextBtn()
        ActivityPageSteps
            .validateTextOnView(Constants.SECOND_FILM)
    }
}