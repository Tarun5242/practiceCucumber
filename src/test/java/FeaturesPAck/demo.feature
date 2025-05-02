Feature: demo

Scenario: Login With valid Credentials

   Given user launch chrome browser
   When user open url "http://admin-demo.nopcommerce.com/login"
   And user enter Emal "admin@yourstore.com" and password as "admin"
   And click on login
   Then page title should be "Dashboard / nopCommerce administration"
   When  user click on logout link
   Then  title should be "Your store. Login"
   And close browser
   
