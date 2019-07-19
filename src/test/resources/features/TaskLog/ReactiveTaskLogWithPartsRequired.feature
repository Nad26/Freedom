Feature: ReactiveTaskLogWithPartsRequired

  Background:
    Given i have logged a task


  Scenario: Validate availability of logged task

    When  I Go to {} portal
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






