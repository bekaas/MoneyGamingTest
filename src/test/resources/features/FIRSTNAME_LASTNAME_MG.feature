Feature: As a new moneygaming.com player I want to be able to register using my full details

  Background: The player is already on the registration page
    Given The player is on the registration page

  Scenario: Verify player can't register with 5 characters long and less than 5.
    When The player enters invalid password
      | User  |
      | Userr |
      | Gamer |
      | gh1   |
      | gfd3  |
      | g     |
      | g4    |
    Then The player should see invalid message

  Scenario: Verify player can't register without at least 1 number
    When the player enters password without number
      | Userer    |
      | Userrdf   |
      | Gamerdg   |
      | ghdfdg    |
      | gfdfgg    |
      | gsdfsdh   |
      | gsdkflskd |
    Then The player should see invalid message


  Scenario: Verify player can't register without at least 1 special character
    When the player enters password without special character
      | Userer12 |
      | Userrd   |
      | Gamerdg4 |
      | ghdfdg6  |
      | gfdf99   |
      | sdjkf48  |
      | user456  |
    Then The player should see invalid message

  Scenario: Verify player can register with valid password
    When the player enters valid password
      | Userer12$ |
      | Userrd&   |
      | Gamerdg4# |
      | ghdfdg6@  |
      | gfdf99&   |
      | sdjkf48!  |
      | user456$% |
    Then the player should see valid message
