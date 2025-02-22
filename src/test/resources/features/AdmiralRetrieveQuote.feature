#Register for a single car of admiral brand, complete quote and retrieve a quote

 Feature: Validating retrieve quote for single car of admiral brand

# Background:
#   Given I Launch chrome browser

 Scenario: Validating retrieve quote for single car

   Given I am on the admiral home page
   And As a portal customer I navigate to single car insurance
   And As a portal customer I click on Get a quote button
   And As a portal customer I click on single car button
   Then As a portal customer ensure navigated to Admiral/direct/search
   And As a portal customer I enter A3 resgistration number
   And As a portal customer I click on search button



