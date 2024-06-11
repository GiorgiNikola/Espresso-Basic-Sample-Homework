package com.example.android.testing.espresso.BasicSample.Steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.Helper.tap
import com.example.android.testing.espresso.BasicSample.Helper.typeText
import com.example.android.testing.espresso.BasicSample.Pages.ChangeTextPage
import org.junit.Assert

object ChangeTextPageSteps {
    fun inputText(text: String): ChangeTextPageSteps{
        with(ChangeTextPage){
            textField.typeText(text);
        }
        return this;
    }

    fun clickChangeTextBtn(): ChangeTextPageSteps{
        with(ChangeTextPage){
            changeTextBtn.tap(5);
        }
        return this;
    }

    fun clickActivityChangeTextBtn(): ChangeTextPageSteps{
        with(ChangeTextPage){
            activityChangeTextBtn.tap(5);
        }
        return this;
    }

    fun clearTextField(): ChangeTextPageSteps{
        with(ChangeTextPage){
            onView(textField).perform(ViewActions.clearText());
        }
        return this;
    }

    fun validateText(expectedText: String): ChangeTextPageSteps{
        with(ChangeTextPage){
            Assert.assertEquals(expectedText, textTitle.getText(5))
        }
        return this;
    }
}