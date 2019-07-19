Feature: TaskLog

  Background:
    Given User goes to Building URL "url"
    And   User Logs in
    When  User select the Building
    Then  User closes the Action Center Modal


  @tc:50

  Scenario Outline: Successful Task Logging

    And  User clicks Log task
    And  User answers the task log dialog with No
    And  User selects an asset
    And  User selects Disc three as: "<Discipline3>" and Disc four as: "<Discipline4>"
    And  User selects the Job title and Location details "<jobTitle>"and"<location>"and"<locationAccess>"and"<locationAccessMsg>"
    And  User selects the task details "<taskType>","<recall>", "<warranty>", "<healthAndSafety>", "<roccInstruction>"
    And  User add task description and trading status "<taskDescription>","<restriction>", "<tradingOption>"
    And  User select trading status confirmation if displayed
    And  User saves and log task with details "<option>","<branchNbr>","<fullName>","<timeOption>" if required
    Then The success notification is displayed to the user
    And  User closes the notification
    And  The task is logged

    Examples:
      | Discipline3 | Discipline4         | jobTitle    | location | locationAccess | locationAccessMsg | taskType                | recall | warranty | healthAndSafety | roccInstruction | taskDescription                        | restriction | tradingOption | option   | branchNbr | fullName | timeOption |
      | Duct        | Blowing out hot air | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | No     | Yes      | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |
      | Duct        | No power            | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | Yes    | No       | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |



  Scenario: Validate task log with restriction




  Scenario: Validate availability of logged task

    Given The task is logged
    When  I Go Main portal
    And   i Go to Client for which Task is raised
    And   i Go to Client HelpDesk
    And   i Select All Tasks
    And   i search for the logged task
    Then  The task is listed


  Scenario: Open logged task

    Given i am on the task list on the Main portal
    When  i Select a logged task
    Then  the task is opened
    And   the Event note tab is opened


  Scenario: Add Event Notes

    Given i am on the events screen
    When  i add Event Note
    Then  The note is saved and appears on the screen


  Scenario: Edit Task Description

    Given i am on the events screen
    When  i edit the description
    Then  the description is saved successfully


  Scenario: Assign Contractor

    When i go to actions tab
    And  i click 'Assign Contractor' from Left menu
    And  i update discipline selections if required
    And  i Navigate through steps 1 to 8 ---(possible verif points)
    And  i Select Contractor to be assigned
    And  i Update SLA if required
    And  i Update Division if required
    And  i Assign Task
    Then the task is assigned to the contractor
    And  the task is available to the contractor to pick up


  Scenario: Create Engineer Visit

    Given i am on the contractor Portal
    And   i selected the required contractor
    When  i Go to Tasks & search for and open the task
    And   i go to Visits tab
    And   i Select Engineer to be assigned
    And   Enter ETA with the reference if required
    And   i click Accept task
    Then  the task is successfully assigned


  Scenario: Manual Check In

  Given i am on the task screen
  When  i Click on Release visit button
  And i Click on Release in pop up
  And i Click on Eye symbol/Visit Details button
  And i Enter Engineer Name in Manual Check in section
  And i Select Arrival date and Click on Check In






