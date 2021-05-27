
@All @Smoke
Feature: Uber Booking Feature
@Smoke @qa-ready @UC-1001 @Epic-900
Scenario: Booking  Cab sedan
Given  User wants  to select a car  type "sedan" from  uber app
When User select car "sedan" and pick up point "Tiko" and drop lacation "Douala"
Then Driver  starts  the journey
And Driver ends  the journey
Then User pays  1000 USD

@All @Smoke @Regression
Scenario: Booking   Cab Jaguar
Given  User wants  to select a car  type "jagua" from  uber app
When User select car "jagua" and pick up point "Kumba" and drop lacation "Limbe"
Then Driver  starts  the journey
And Driver ends  the journey
Then User pays  1000 USD

@Smoke
Scenario: Booking   Cab Toyota LandCruiser
Given  User wants  to select a car  type " Toyota LandCruiser" from  uber app
When User select car "Toyota landCruiser" and pick up point "Yaounde" and drop lacation "Bamenda"
Then Driver  starts  the journey
And Driver ends  the journey
Then User pays  1000 USD

@Prod
Scenario: Booking   Cab Mercedes
Given  User wants  to select a car  type " Mercedes" from  uber app
When User select car "Mercedes" and pick up point "Edea" and drop lacation "Bafoussam"
Then Driver  starts  the journey
And Driver ends  the journey
Then User pays  1000 USD