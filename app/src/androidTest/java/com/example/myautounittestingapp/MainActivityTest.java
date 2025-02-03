package com.example.myautounittestingapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.pressBack;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testMainActivityUI() {

        onView(withId(R.id.tvTitle)).check(matches(ViewMatchers.isDisplayed()));
        onView(withId(R.id.btnVisible)).perform(click());
        onView(withId(R.id.view)).check(matches(ViewMatchers.isDisplayed()));
        onView(withId(R.id.btnVisible)).perform(click());
        onView(withId(R.id.btnVisible)).perform(longClick());
        onView(withId(R.id.btnLogin)).check(matches(ViewMatchers.isDisplayed()));
        onView(withId(R.id.etEmail)).perform(ViewActions.typeText("Mohanned27821@gmail.com"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.etPassword)).perform(ViewActions.typeText("1020304050"), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnLogin)).perform(click());
        onView(withText("Email: Is Valid")).check(matches(isDisplayed()));
        onView(withText("Password: Is Valid")).check(matches(isDisplayed()));
        onView(isRoot()).perform(pressBack());
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()));
    }




    @Test
    public void MainActivityUI() {

        ViewInteraction viewShow = onView(
                allOf(withId(R.id.view),
                        withParent(withId(R.id.main)),
                        isDisplayed()));
        viewShow.check(matches(isDisplayed()));


        ViewInteraction btnVisible = onView(
                allOf(withId(R.id.btnVisible),
                        withParent(withId(R.id.main)),
                        isDisplayed()));
        btnVisible.perform(click());


        btnVisible.perform(longClick());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.btnLogin), withText("LOGIN"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button6.check(matches(isDisplayed()));

    }



}