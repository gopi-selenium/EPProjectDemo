Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  A scenario Insert A data in Employee Table but it missing a Last Name , Department Name and Designation Name
When I Enter Employee Details as "Himansu" "" "" ""
Then Check Whether Employee Details Entered as "Himansu" "" "" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name ,Department Name and Designation Name
When I Enter Employee Details as "" "Gupta" "" ""
Then Check Whether Employee Details Entered as "" "Gupta" "" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name ,Last Name and Designation Name
When I Enter Employee Details as "" "" "QA" ""
Then Check Whether Employee Details Entered as "" "" "QA" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name ,Last Name and Department Name
When I Enter Employee Details as "" "" "" "ENGINEER"
Then Check Whether Employee Details Entered as "" "" "" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a Department Name and Designation Name
When I Enter Employee Details as "Himansu" "Gupta" "" ""
Then Check Whether Employee Details Entered as "Himansu" "Gupta" "" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a Last Name and Designation Name
When I Enter Employee Details as "Himansu" "" "QA" ""
Then Check Whether Employee Details Entered as "Himansu" "" "QA" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a Last Name and Department Name
When I Enter Employee Details as "Himansu" "" "" "ENGINEER"
Then Check Whether Employee Details Entered as "Himansu" "" "" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name and Designation Name
When I Enter Employee Details as "" "Gupta" "QA"  ""
Then Check Whether Employee Details Entered as "" "Gupta" "QA" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name and Department Name
When I Enter Employee Details as "" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details Entered as "" "Gupta" "" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a  First Name and Last Name 
When I Enter Employee Details as "" "" "QA" "ENGINEER"
Then Check Whether Employee Details Entered as "" "" "QA" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a Designation Name
When I Enter Employee Details as "Himansu" "Gupta" "QA" ""
Then Check Whether Employee Details Entered as "Himansu" "Gupta" "QA" ""

Scenario:  A scenario Insert A data in Employee Table but it missing a Department Name
When I Enter Employee Details as "Himansu" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details Entered as "Himansu" "Gupta" "" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a Last Name
When I Enter Employee Details as "Himansu" "" "QA" "ENGINEER"
Then Check Whether Employee Details Entered as "Himansu" "" "QA" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table but it missing a First Name
When I Enter Employee Details as "" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details Entered as "" "Gupta" "QA" "ENGINEER"

Scenario:  A scenario Insert A data in Employee Table All details
When I Enter Employee Details as "Himansu" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details Entered as "Himansu" "Gupta" "QA" "ENGINEER"








Scenario:  Scenario for updating data in Employee Table but it is missing First Name, Last Name , Department Name and Designation Name
When I Update Employee Details as "1" "" "" "" ""
Then Check Whether Employee Details are Updated as "1" "" "" "" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, Last Name , Department Name and Designation Name
When I Update Employee Details as "" "Himanshu" "" "" ""
Then Check Whether Employee Details are Updated as "" "Himanshu" "" "" ""


Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, First Name, Department Name and Designation Name
When I Update Employee Details as "" "" "Gupta" "" ""
Then Check Whether Employee Details are Updated as "" "" "Gupta" "" ""

Scenario:   Scenario for updating data in Employee Table but it is missing Employee ID, First Name, Last Name and Designation Name
When I Update Employee Details as "" "" "" "QA" ""
Then Check Whether Employee Details are Updated as "" "" "" "QA" ""

Scenario: Scenario for updating data in Employee Table but it is missing Employee ID, First Name ,Last Name and Department Name
When I Update Employee Details as "" "" "" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "" "" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Last Name , Department Name and Designation Name
When I Update Employee Details as "1" "Himanshu" "" "" ""
Then Check Whether Employee Details are Updated as "1" "Himanshu" "" "" ""

Scenario:  Scenario for updating data in Employee Table but it is missing First Name , Department Name and Designation Name
When I Update Employee Details as "1" "" "Gupta" "" ""
Then Check Whether Employee Details are Updated as "1" "" "Gupta" "" ""

Scenario:  Scenario for updating data in Employee Table but it is missing First name Last Name and Designation Name
When I Update Employee Details as "1" "" "" "QA" ""
Then Check Whether Employee Details are Updated as "1" "" "" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing First Name Last Name and Department Name
When I Update Employee Details as "1" "" "" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "1" "" "" "" "ENGINEER"

Scenario:   Scenario for updating data in Employee Table but it is missing Employee ID, Department Name and Designation Name
When I Update Employee Details as "" "Himanshu" "Gupta" "" ""
Then Check Whether Employee Details are Updated as "" "Himanshu" "Gupta" "" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, Last Name and Designation Name
When I Update Employee Details as "" "Himanshu" "" "QA" ""
Then Check Whether Employee Details are Updated as "" "Himanshu" "" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, Last Name and Department Name
When I Update Employee Details as "" "Himanshu" "" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "Himanshu" "" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, First Name and Designation Name
When I Update Employee Details as "" "" "Gupta" "QA"  ""
Then Check Whether Employee Details are Updated as "" "" "Gupta" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID, First Name and Department Name
When I Update Employee Details as "" "" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "" "Gupta" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID,  First Name and Last Name 
When I Update Employee Details as "" "" "" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "" "" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Department Name and Designation Name
When I Update Employee Details as "1" "Himanshu" "Gupta" "" ""
Then Check Whether Employee Details are Updated as "1" "Himanshu" "Gupta" "" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Last Name and Designation Name
When I Update Employee Details as "1" "Himanshu" "" "QA" ""
Then Check Whether Employee Details are Updated as "1" "Himanshu" "" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Last Name and Department Name
When I Update Employee Details as "1" "Himanshu" "" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "1" "Himanshu" "" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing First Name and Designation Name
When I Update Employee Details as "1" "" "Gupta" "QA" ""
Then Check Whether Employee Details are Updated as "1" "" "Gupta" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing First Name and Department Name
When I Update Employee Details as "1" "" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "1" "" "Gupta" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing First Name and Last Name
When I Update Employee Details as "1" "" "" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "1" "" "" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID and Designation Name
When I Update Employee Details as "" "Himanshu" "Gupta" "QA" ""
Then Check Whether Employee Details are Updated as "" "Himanshu" "Gupta" "QA" ""

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID and Department Name
When I Update Employee Details as "" "Himanshu" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "Himanshu" "Gupta" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID and Last Name
When I Update Employee Details as "" "Himanshu" "" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "Himanshu" "" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID and First Name
When I Update Employee Details as "" "" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "" "Gupta" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Employee ID 
When I Update Employee Details as "" "Himanshu" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "" "Himanshu" "Gupta" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing First Name 
When I Update Employee Details as "2" "" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "2" "" "Gupta" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Last Name 
When I Update Employee Details as "2" "Himanshu" "" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "2" "Himanshu" "" "QA" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Department Name
When I Update Employee Details as "2" "Himanshu" "Gupta" "" "ENGINEER"
Then Check Whether Employee Details are Updated as "2" "Himanshu" "Gupta" "" "ENGINEER"

Scenario:  Scenario for updating data in Employee Table but it is missing Designation Name 
When I Update Employee Details as "2" "Himanshu" "Gupta" "QA" ""
Then Check Whether Employee Details are Updated as "2" "Himanshu" "Gupta" "QA" ""

Scenario:  Scenario for updating data in Employee Table All details
When I Update Employee Details as "2" "Himanshu" "Gupta" "QA" "ENGINEER"
Then Check Whether Employee Details are Updated as "2" "Himanshu" "Gupta" "QA" "ENGINEER"






Scenario:  Scenario for Deleting data in Employee Table when it is missing an Employee ID
When I Delete Employee Details of ""
Then Check Whether Employee Details of "" is still present

Scenario:  Scenario for Deleting data in Employee Table when it is having an invalid Employee ID
When I Delete Employee Details of "00"
Then Check Whether Employee Details of "00" is still present


Scenario:  Scenario for Deleting data in Employee Table when it is having wrong Employee ID
When I Delete Employee Details of "1251"
Then Check Whether Employee Details of "1251" is still present

Scenario:   Scenario for Deleting data in Employee Table when it is having valid Employee ID
When I Delete Employee Details of "9"
Then Check Whether Employee Details of "9" is still present





Scenario:  Scenario for Transaction from one account to another but it is missing an Destination Employee eID and amount
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "2" "" ""
Then Check Whether Transaction Details as "2" "" "" are present

Scenario:  Scenario for Transaction from one account to another but it is missing an source Employee ID and and amount
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "" "3" ""
Then Check Whether Transaction Details as "" "3" "" are present

Scenario: Scenario for Transaction from one account to another but it is missing an source Employee ID and Destination Employe ID
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "" "" "1000"
Then Check Whether Transaction Details as "" "" "1000" are present

Scenario:  Scenario for Transaction from one account to another but it is missing an amount
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "2" "3" ""
Then Check Whether Transaction Details as "2" "3" "" are present

Scenario:  Scenario for Transaction from one account to another but it is having an invalid source Employee ID 
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "556" "3" "1000"
Then Check Whether Transaction Details as "556" "3" "1000" are present

Scenario:  Scenario for Transaction from one account to another but it is having an invalid Amount 
Given Account details of Employees "2" "3"
When I Enter Transaction Details as "2" "3" "-1000"
Then Check Whether Transaction Details as "2" "3" "-1000" are present

Scenario:  Scenario for Transaction from one account to another but it is having more Amount than Balance Amount
Given Account details of Employees "3" "2" 
When I Enter Transaction Details as "3" "2" "100000"
Then Check Whether Transaction Details as "3" "2" "100000" are present

Scenario: Scenario for Transaction from one account to another with valid data
Given Account details of Employees "3" "2"
When I Enter Transaction Details as "3" "2" "10000"
Then Check Whether Transaction Details as "3" "2" "10000" are present

