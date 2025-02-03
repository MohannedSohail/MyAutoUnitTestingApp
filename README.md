UI Automation Testing with Espresso

📌Features

✅ Verifies UI elements' visibility and interaction

✅ Simulates button clicks and long clicks

✅ Performs text input and form validation

✅ Checks UI behavior after user actions

✅ Handles keyboard interactions

✅ Simulates back navigation



📌Technologies Used

Espresso for UI testing

JUnit for test execution

AndroidX Test Library Kotlin/Java (depending on implementation)



📌Test Scenario Overview

Check if the welcome text (tvHello) is displayed

Click the visibility button (btnVisible) → Ensure the view element appears

Click btnVisible again → Ensure the view element disappears

Perform a long click on btnVisible

Validate that the login button (btnLogin) is displayed

Enter email and password in input fields

Click btnLogin and verify validation messages

Simulate pressing the back button

Ensure tvHello is still visible after navigating back

