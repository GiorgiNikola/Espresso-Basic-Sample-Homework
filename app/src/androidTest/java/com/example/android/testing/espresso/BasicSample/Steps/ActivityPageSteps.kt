package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.Pages.ActivityPage
import org.junit.Assert

object ActivityPageSteps {
    fun validateTextOnView(expectedText: String): ActivityPageSteps{
        with(ActivityPage){
            Assert.assertEquals(expectedText, textView.getText(5))
        }
        return this;
    }
}