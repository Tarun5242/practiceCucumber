Feature: Test login

  Scenario Outline: data dirven test for login
    Given open chrome driver
    Then give "url" and search
    When give login Details<"username">and<"password">
    Then click on ok button
    And title checked matched
    Then click on logout button

    Examples: 
      | username | password |
      | jack     | 12345  |
      | Ashok    | 12345 |
      |Aashish   |  67890 |
      
      
      # Regular expression
      #  starts with  ^
      # ends with   $
      # ([a-zA-Z]{1,})    any number of alphabets example "tarun"  or "JACK"
      #  ([a-zA-Z0-9]{1,})     alpha numeric   20jan2012   no space between date   or   tarunsirvi1995
      # (\\d+)    for any number   1235   456
      #   (.*)    list    like in line number 6 of this code
      # ([^\"]*)   anything     exapmle 20 jan 2012   yha space hai   or 10% tarunsirvi1995@gmail.com
      
      
      
      #cucumber expression
      #  {String}    example  "I AM JACK"
      #    {word}     Hello
      #   {}    anything Asd#.rf@3
      #   {int}   4478
    
      