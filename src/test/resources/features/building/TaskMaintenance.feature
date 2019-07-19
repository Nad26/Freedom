Feature: Task Validation and Maintainance

  Background: Open logged task


    Given i login to the main portal "<string>"
    When  i search and open the required client "kfc" logged task "<string>"
    Then  the task is displayed

  @Smoke
  Scenario Outline:  Validate Event Notes Addition

    #Given i have logged a task
    And i am on the events screen of logged task
    When  i add and save the Event Note details "<spokeTo>","<eventType>","<eventTitle>","<description>"
    Then  The note "<description>" is saved and appears on the screen

    Examples:
      | spokeTo | eventType| eventTitle   | description |
      |Testteam|PC|Job Status Review| Even Description|

  @Smoke
  Scenario Outline: Validate Task Description Editing

    Given i am on the events screen of logged task
    When  i edit the description with description: "<description>"
    Then  the description is saved successfully as "<description>"

    Examples:
      | description |
      |TaskDescription  |


  Scenario Outline: Validate Contractor Assignment

    Given i am on the events screen of logged task
    When i go to Actions tab
    And  i click Assign Contractor
    Then The Step One of the contract Assignment "<Step1>" is opened
    When i Navigate through the assignment verification steps "<Step2>","<Step3>","<Step4>","<Step5>","<Step6>","<Step7>","<Step8>"
    And  i Select and Assign Contractor to be assigned as "New Demo Contractor (For New Testing Purposes)"
    Then the task is assigned to the contractor "New Demo Contractor (For New Testing Purposes)"
    And  the task is available to the contractor to pick up

    Examples:
      |Step1|Step2|Step3|Step4|
      |STEP 1 / 8 Confirm Discipline|STEP 2 / 8 Contractor Client Instructions|STEP 3 / 8 Quotes|STEP 4 / 8 List of current Open Odd Jobs|

    Examples:
      |Step5|Step6|Step7|Step8|
      |STEP 5 / 8 Engineers attended within the last 14 days|STEP 6 / 8 Engineers attending within the next 31 days|STEP 7 / 8 Is this a recall or warranty?|STEP 8 / 8 Assign contractor|


  Scenario: Validate Contractor Assignment with task details updates

    When i go to actions tab
    And  i click 'Assign Contractor'
    And  i Navigate through steps 1 to 8
    And  i Select Contractor to be assigned
    And  i Update SLA
    And  i Update Division if required
    And  i Assign Task
    Then the task is assigned to the contractor
    And  the task is available to the contractor to pick up


  Scenario: Validate Engineer Visit Creation

    Given i am on the contractor Portal
    And   i selected the required contractor
    When  i Go to Tasks & search for and open the task
    And   i go to Visits tab
    And   i Select Engineer to be assigned
    And   Enter ETA with the reference if required
    And   i click Accept task
    Then  the task is successfully assigned


  Scenario: Validate Manual Check In

    Given i am on the task screen
    When  i Click on Release visit button
    And i Click on Release in pop up
    And i Click on Eye symbol/Visit Details button
    And i Enter Engineer Name in Manual Check in section
    And i Select Arrival date and Click on Check In


  Scenario:  Validate Worksheet Document Upload

    When i Click on Documents tab
    And  i Click on upload document
    And i Select Document type as Worksheets, category
    And i Click on appropriate engieer check in row
    And i Update description, document date
    And i Select document from desktop and click on Upload button
    Then the document is successfully updated


  Scenario: Validate Manual Check Out with status Parts Required

    When i Click on Visits tab
    And i Click on Eye symbol Visit Details button
    And i Update Engineer details, Mileage, travel time to site, Service sheet No, Description, material and Severity
    When i Select Task status as Parts Required
    And i Update Name of signatory Departure date
    And i click on Check out
    And i Refresh the page
    Then the Check status is ...


  Scenario: Validate Visit Charging

    When i Go to Charging tab
    And i Create visit Charge
    And i Commit the charges
    Then the charges are saved

  Scenario: Validate Application Creation

    When i Open Finance page
    And i Click on Create application
    And i Select Client
    And Submit the application
    Then The application is successfully submitted


  Scenario: Validate Agreed Charges

    Given i Navigate to Certficates page Main Portal
    And i open Pending applications for the appropriate contractor
    When i Navigate to Awaiting CA tab
    And i Search for same task and click on it
    And i Click on Agree button
    And i Click on confirm in Submit the charge pop up
    And i Click on OK in pop up


  Scenario: Validate Invoice Certificate creation

    Given i Navigate to Certficates page on main portal
    When i Click on Pending applications
    And i Click on certify button for particular contractor
    Then the certification is successfully

  Scenario: Validate invoice Certificate Upload

    Given i Navigate to finance page on contractor portal
    And i Click on Certificates
    And i Select client
    When i Click on Upload invoice button across same certificate
    And i Update invoice number, VAT type and click on Upload invoice button
    And i Navigate to Certificates page
    Then the Uploaded invoice for that appropriate certificate is available


  Scenario: Validate Invoice Approval

    Given i am on Finance page of the Main Portal
    When i Run the invoice batch file
    And i Navigate to Unverified Invoices - Cost page
    And i Click on Approve (thumbs up) button
    Then the invoice is successfully approved


  Scenario Outline: Validate Reactive Task Log With Parts Required

    Given i have logged a reactive task with "<Duct>","<Duct>","<Duct>","<Duct>","<Duct>","<Duct>","<Duct>",
    When i Open the logged task
    And  i Assign a Contractor
    And  i Create a Engineer Visit
    And  i Check in to the building
    And  i Upload Worksheet Document after work completion

    Examples:
      | Discipline3 | Discipline4         | jobTitle    | location | locationAccess | locationAccessMsg | taskType                | recall | warranty | healthAndSafety | roccInstruction | taskDescription                        | restriction | tradingOption | option   | branchNbr | fullName | timeOption |
      | Duct        | Blowing out hot air | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | No     | Yes      | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |
      | Duct        | No power            | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | Yes    | No       | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |

