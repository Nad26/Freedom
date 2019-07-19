Feature: TaskLog

  Background:
    Given User goes to Building URL "url"
    And   User Logs in
    When  User select the Building
    Then  User closes the Action Center Modal



  Scenario Outline: Validate Successful Task Logging

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

    Examples:
      | Discipline3 | Discipline4         | jobTitle    | location | locationAccess | locationAccessMsg | taskType                | recall | warranty | healthAndSafety | roccInstruction | taskDescription                        | restriction | tradingOption | option   | branchNbr | fullName | timeOption |
      | Duct        | Blowing out hot air | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | No     | Yes      | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |
      | Duct        | No power            | Team Leader | Lobby    | No             | Area under stairs | Standard Reactive tasks | Yes    | No       | No              | No              | New task logged for testing of the App | No          | No            | Continue | 1234      | TestName | Yes        |



