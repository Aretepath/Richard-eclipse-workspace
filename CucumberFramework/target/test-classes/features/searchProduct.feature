Feature: Search and PLace the order for the Products

Scenario: Search Experience for product search in both home and offers page

Given User is on a GreenCart Landing page
When user searched with short name "Tom" and extracted actual name of product
Then user search for the "Tom" shortname in offers page to check if the product exist
And Validate product name in offers page matches with Landing Page