Feature: Create Delete Restore MEGA Txt File

  Scenario Outline: Create Txt File in MEGA App
    Given User is on Home Screen
    When User clicks Docs
    And User clicks Add Button
    And User creates a "<fileName>" file
    Then "<fileName>" file exists in Docs
    Examples:
      |  fileName |
      |   a.txt   |

  Scenario Outline: Delete Txt File in MEGA App
    Given User is on Home Screen
    And User clicks Docs
    When User clicks Docs three dot option for "<fileName>"
    And User swipes up
    And User clicks Rubbish Bin from Options
    And User clicks Move
    And User navigates Back
    And User clicks Left Menu button
    And User clicks Rubbish Bin from Left Menu
    Then "<fileName>" file exists in Rubbish Bin
    Examples:
      |  fileName |
      |   a.txt   |

  Scenario Outline: Restore Txt File in MEGA App
    Given User is on Home Screen
    And User clicks Left Menu button
    And User clicks Rubbish Bin from Left Menu
    And User clicks Rubbish Bin three dot option for "<fileName>"
    And User clicks Restore
    And User navigates Back
    And User clicks Docs
    Then "<fileName>" file exists in Docs
    Examples:
      |  fileName |
      |   a.txt   |



