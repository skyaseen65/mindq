Feature: Flipkart search test
Scenario: product search functionality test
Given user launch the chrome browser
When user opens url "https://www.flipkart.com"
And user provides username as "9985183883"
And user enter password as "skyaseen701"
And click  on login button
Then page url should be "https://flipkart.com"