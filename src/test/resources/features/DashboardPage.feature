Feature: User drags and drops departments, adds departments, employees etc.
  user story:
  As a user, I should be able to use functions on Company Structure under Employee menu.

  users are:
  HR
  Marketing
  Helpdesk

  @wip
  Scenario Outline: employees should be able to use the functions on company structure
    Given the user logs in as a "<userType>"
    When The user should be able to see the company structure
    And The HR user should be able to add department
    And The HR user should be able to add department name
    And The HR user should be able to select parent department
    Then The HR user should be able to add supervisors
    Then The HR user is able to close the add department pop-up at any time

    Examples: employees credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

  @wip
  Scenario Outline: HR user should be able to delete and move departments
    Given The HR user is on the company structure section
    When The HR user is able to edit departments
    And The HR user is able to add child departments
    And The HR user is able to delete the departments
    Then The HR user is able to drag and drop departments

    Examples: employees credentials
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr1@cybertekschool.com        | UserUser |

