Feature:   Uber booking

@Smoke
Scenario:  Booking Cab sedan
Given  select car type "sedan" from ober application
When pick uppoint "Delhi" and drop point " jaipur"
Then driver starts the jounary
And Dricer ened the jounary
Then total fare is 4000

@Regression @Smoke
Scenario: Booking cab suv
Given  select car type "suv" from ober application
When pick uppoint "Delhi" and drop point " Rishikesh"
Then driver starts the jounary
And Dricer ened the jounary
Then total fare is 3000

@Product
Scenario:   Booking cab mini car
Given  select car type "mini" from ober application
When pick uppoint "Delhi" and drop point "gurugram"
Then driver starts the jounary
And Dricer ened the jounary
Then total fare is 1000