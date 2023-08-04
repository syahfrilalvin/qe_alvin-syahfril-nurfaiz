Feature: API Login

  #Positive Testing
  Scenario: User dapat login dengan valid request
    Given saya mempunyai url login
    When saya mengisi email dan password valid
    Then login sukses dengan keterangan 200 OK

    #Negative Testing
  Scenario: User login dengan mengosongkan email dan password
    Given saya mempunyai url login
    When saya mengosongkan email dan password
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengosongkan email dan mengisi password
    Given saya mempunyai url login
    When saya mengosongkan email dan mengisi password
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengosongkan password dan mengisi email
    Given saya mempunyai url login
    When saya mengosongkan password dan mengisi email
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengisi email valid dan mengosongkan password
    Given saya mempunyai url login
    When saya mengosongkan password dan mengisi email valid
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengosongkan email dan mengisi password valid
    Given saya mempunyai url login
    When saya mengosongkan email dan mengisi password valid
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengisi email valid dan mengisi password invalid
    Given saya mempunyai url login
    When saya mengisi email valid dan mengisi password invalid
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengisi password valid dan mengisi email invalid
    Given saya mempunyai url login
    When saya mengisi password valid dan mengisi email invalid
    Then gagal login dengan status 400 Bad Request

  Scenario: User login dengan mengisi email dan password invalid
    Given saya mempunyai url login
    When saya mengosongkan  mengisi email dan password invalid
    Then gagal login dengan status 400 Bad Request