Feature: Google serch page validation


Scenario: Google page title
Given user launched the "google page"
And User gets the title fo the page
Then Page title should be "Google"


Scenario: Check the search box
Given user launched the "google page"
Then check the search box
