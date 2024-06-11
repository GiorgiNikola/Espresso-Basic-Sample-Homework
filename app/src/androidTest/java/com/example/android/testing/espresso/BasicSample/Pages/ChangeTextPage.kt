package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher


object ChangeTextPage {
    val textField: Matcher<View> by lazy { withId(R.id.editTextUserInput) }
    val changeTextBtn: Matcher<View> by lazy { withId(R.id.changeTextBt) }
    val activityChangeTextBtn: Matcher<View> by lazy { withId(R.id.activityChangeTextBtn) }
    val textTitle: Matcher<View> by lazy { withId(R.id.textToBeChanged) }
}