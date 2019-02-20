Feature: Login Action
Description: Test Login

Scenario: Successful Login with InValid Credentials
	Given User is on Home Page
	And User enters incorrect UserName and incorrect Password
	Then Message displayed Login Denied

