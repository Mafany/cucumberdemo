


Feature: Amazon Search

Scenario: Search a Product MacBook air
Given I have a  search field on Amazon Page
When I search  for a product with  name "Apple MacBook Pro" and price 1000
Then  Product with name  "Apple MacBook Pro" should  be  displayed




Scenario: Search a Product Iphone
Given I have a  search field on Amazon Page
When I search  for a product with  name "Apple Iphone" and price 2000
Then  Product with name  "Apple  Iphone" should  be  displayed

