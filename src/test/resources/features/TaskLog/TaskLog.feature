Feature: TaskLog

  Background:
    Given User logs in to "building" portal
    When  User select the Building "Accrington DT"
    Then  User closes the Action Center Modal



  Scenario Outline: Successful Task Logging

    And  User clicks Log task
    And  User answers the task log dialog with No
    And  User selects manual log with required Disciplines "<Discipline1>","<Discipline2>","<Discipline3>" and "<Discipline4>"
    And  User selects the Job title and Location details "<jobTitle>"and"<location>"and"<locationAccess>"and"<locationAccessMsg>"
    And  User selects the task details "<taskType>","<recall>", "<warranty>", "<healthAndSafety>", "<roccInstruction>"
    And  User add task description and trading status "<taskDescription>","<restriction>", "<tradingOption>"
    And  User select trading status confirmation if displayed
    And  User saves and log task with details "<option>","<branchNbr>","<fullName>","<timeOption>" if required
    Then The success notification is displayed to the user
    And  User closes the notification
    And  The task is logged

    Examples:
      | Discipline1 | Discipline2| Discipline3 | Discipline4|jobTitle|location | locationAccess | locationAccessMsg | taskType| recall | warranty | healthAndSafety | roccInstruction | taskDescription                        | restriction | tradingOption | option   | branchNbr | fullName | timeOption |
      | Heating & Ventilation (HVAC)|Extraction|Fan|Not working|Restaurant General Manager|Lobby| No| Area under stairs | Standard Reactive tasks | No     | Yes      | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |
      | Heating & Ventilation (HVAC)|Air Conditioning|Duct| No power|Team Leader|Lobby| No| Area under stairs | Standard Reactive tasks | Yes    | No       | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |



  Scenario: Log a task with restricted trading status

    When  User clicks Log task
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


  Scenario: Log a Health and Safety task


  Scenario: Log a quote works task



  Scenario: Log a BCT task



  Scenario: Upload Photo from BCT task



  Scenario: Bundle the task and verify in BCT task card page



  Scenario: Cancel BCT task and check the status




