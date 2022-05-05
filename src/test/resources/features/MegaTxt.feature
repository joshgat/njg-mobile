Feature: Create Delete Restore MEGA Txt File

  @MegaTxtFile
  Scenario Outline: Create Txt File in MEGA App
    Given User is on Home Screen
    Given User clicks Docs
    Given User clicks Plus
    When User creates a "<fileName>" file
    Then "<fileName>" file is created in Docs
    Examples:
      |  fileName |
      |   a.txt   |

