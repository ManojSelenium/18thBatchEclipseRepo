Feature: As a user I want to create new account

Scenario Outline: Verify that application creates new user
Given user launch the browser
When user enter url
And user click on signin link
And user enter email address as "<emailAddress>"
And user click on create account button
And user enter firstname as "<firstName>"
And user enter lastname as "<lastName>"

Examples:
|emailAddress           |firstName|lastName|
|manoj123@mailinator.com|Manoj    |Manoj   |
