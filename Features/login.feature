Feature: AmazonLogin

Scenario: Login functionality Test
Given user launch chrome browser
When user opens url "https://amazon.in"
And user click on Signin button
And user enter email as "skyaseen701@gmail.com"
And user click on continue button
And user enter password as "skyaseen65"
And user click on Login button
Then Page url should be "https://www.amazon.in/?ref_=nav_ya_signin&"