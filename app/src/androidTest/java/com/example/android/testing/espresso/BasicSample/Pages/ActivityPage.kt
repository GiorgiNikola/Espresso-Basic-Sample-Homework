package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ActivityPage {
    val textView: Matcher<View> by lazy { ViewMatchers.withId(R.id.show_text_view) }
}