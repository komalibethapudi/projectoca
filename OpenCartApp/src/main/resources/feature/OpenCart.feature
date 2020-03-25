Feature: OpenCartApplication 
  In order to create a webpage
  As a e-commerce vendor
  I want to get access to the portal
  
  Background: these are the steps common for every scenario to be followed
  Given I have browser with opencartpage 
  
  Scenario Outline: ValidRegisterCredential
  When I enter '<firstname>' and '<lastname>' and '<email>' and '<telephone>' and enter '<address>' and '<city>' and '<postcode>' and '<country>' and '<region>' and enter '<password>' and '<passwordconfirm>'
  Then my account has created
    
  Examples:
  |firstname|lastname|email|telephone|address|city|postcode|country|region|password|passwordconfirm|
  |lill|chintabathina|liilly222333@gmail.com|7232548101|sidharthanagar|podalada|530244|India|Andhra Pradesh|komali1234|komali1234|
  
  Scenario Outline: InValidRegisterCredential
  When user enter '<firstname>' and '<lastname>' and '<email>' and '<telephone>' and '<address>' and '<city>' and '<postcode>' and '<country>' and '<region>' and '<password>' and '<passwordconfirm>'
  Then I get Invalid credentials 
   
  Examples:
  |firstname|lastname|email|telephone|address|city|postcode|country|region|password|passwordconfirm|
  |lilly|chintabathina|s0nii12@gmail.com|9052349765|sidharthanagar|podalada|532243|India|Delhi|komali1234|komali1234|
  
  
     Scenario: ClickOnSoftware
   When I click on the product Software
   Then I should get the text
   
    Scenario Outline: ClickOnWishList
   When I enter '<username>' and '<password>' and click on WishList
   Then I should get My WishList
   
   Examples:
   |username|password|
   |anjanipriya123@gmail.com|anju.555|
   
   Scenario Outline: ClickOnLogout
   When I enter '<username>' and '<password>' and click on logout
   Then I should logout from the page
   
   Examples:
   |username|password|
   |anjanipriya123@gmail.com|anju.555|
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  