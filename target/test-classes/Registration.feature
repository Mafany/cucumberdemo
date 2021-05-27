
 Feature: User Registration 
  
 Scenario:  User registration with different data
    Given User is on  registration page
    When User enters following user details
      | Jeff    | Mafany| jeffmafany@gmail.com    | 047987981 |  Tokyo     |
      | Melissa | Mafany| melissamaf@gmail.com    | 04894587  |  New York  |
      | Beyonce | Enanga| jbeyenang@hotmail.com   | 074012569 | London     |
      | Emma    | Lyonga| emmamafany@gmail.com    | 0893256   |  Tiko      |
    Then user registration should be  successful  
    
    
    
    Scenario:  User registration with different data with columns
    Given User is on  registration page
    When User enters following user details with columns
      |firstname| lastname| email                 | telephone   |    city    |
      | Jeff    | Mafany  | jeffmafany@gmail.com    | 047987981 |  Tokyo     |
      | Melissa | Mafany  | melissamaf@gmail.com    | 04894587  |  New York  |
      | Beyonce | Enanga  | jbeyenang@hotmail.com   | 074012569 | London     |
      | Emma    | Lyonga  | emmamafany@gmail.com    | 0893256   |  Tiko      |
    Then user registration should be  successful  