Feature: API Get Detail User

  Scenario: API get user detail dengan valid request
    Given saya mempunyai url get user detail
    When saya request dengan valid request
    Then berhasil mendapatkan user detail dengan status 200 OK

  Scenario: API get user detail dengan tanpa authorization token
    Given saya mempunyai url get user detail
    When saya request tanpa authorization token
    Then gagal mendapatkan user detail status 401 Unauthorized