Feature: MainPage
  As a user
  I want to check functionality of the button with redirect valid page and funtionality search feature
  So i can access redirect page valid

  Scenario: Verify button jaringan saya
    Given I in main page linkedin
    When I clicked button jaringan saya
    Then I will go to my network page

  Scenario: Verify button pekerjaan
    Given I in main page linkedin
    When  I clicked button pekerjaan
    Then I will go to jobs page


  Scenario: Verify button pesan
    Given I in main page linkedin
    When I clicked button pesan
    Then I will go to messaging page

  Scenario: Verify button notifikasi
    Given I in main page linkedin
    When I clicked button notifikasi
    Then I will go to notifications page


  Scenario: Verify button halaman utama
    Given I in main page linkedin
    When I clicked button halaman utama
    Then I will go to feed page

  Scenario: Verify button ikuti
    Given I in main page linkedin
    When I clicked button ikuti
    Then Text on button wil change to "Mengikuti"
    And Icons will change to a checklist

  Scenario: Keywoard input in search feature valid
    Given I in main page linkedin
    When I clicked search feature
    And I type keywoard "PT Bank Mandiri"
    And I press enter
    Then Display the results that the user is looking for in the company

  Scenario: Keywoard input in search feature ivalid
    Given I in main page linkedin
    When I clicked search feature
    And I type keywoard "adfadsfasdfasdfasdfasd"
    And I press enter
    Then Show message no results found