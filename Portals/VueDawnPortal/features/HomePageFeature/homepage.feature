#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Verify Headers and subHeaders of Home Page
  This feature File will verify the Headers and Sub header text.

  @Smoke
  Scenario Outline: Title of Page
    Given User is on home page
    When User closes cookie dialog box
    Then Verify the title of <Actual> page

    Examples: 
      | Actual |
      | home   |
      | login  |

  Scenario: Main Header Text
    Given User is on home page
    When User closes cookie dialog box
    Then Verify the main Header Text of Home Page ""

  Scenario: SubHeader Text
    Given User is on home page
    When User closes cookie dialog box
    Then Verify the Sub Header Text of Home Page ""

  @Regression
  Scenario: Verify Image
    Given User is on home page
    When User closes cookie dialog box
    Then Verify the  carbonite Logo on Home Page

  Scenario: Main Header Text
    Given User is on home page
    When User closes cookie dialog box
    Then Verify the main Header Text of Home Page ""
