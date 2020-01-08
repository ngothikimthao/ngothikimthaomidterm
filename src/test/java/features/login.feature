# new feature
# Tags: optional

Feature: Customer login

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario: Customer login
    When I click username as Harry Potter
    And I click submit
    Then I verify that login successfully with name as Harry Potter