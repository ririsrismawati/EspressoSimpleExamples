package com.fortyonestudio.tutorial.espressosimpleexamples;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

/**
 * Created by Riris.
 */
public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    public static final String USER_NAME = "foo@example.com";
    public static final String PASSWORD = "hello";
    public static final String GREETING_MESSAGE = "Hello " + USER_NAME + "!";

    public LoginActivityTest() {
        super(LoginActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        getActivity();
    }

//    public void testHintDisplayed() {
//        onView(withId(R.id.email)).check(matches(withHint(R.string.prompt_email)));
//        onView(withId(R.id.password)).check(matches(withHint(R.string.prompt_password)));
//    }

    public void testErrorMessageDisplayed() {

        // Click on "Next" button
        onView(withId(R.id.email_sign_in_button)).perform(click());

    }

    public void testGreetingMessageWithNameDisplayed() {
        onView(withId(R.id.email)).perform(typeText(USER_NAME));
        onView(withId(R.id.password)).perform(typeText(PASSWORD));
        onView(withId(R.id.email_sign_in_button)).perform(click());

    }
}
