Feature: API Create Category

  Scenario: API create category dengan parameter valid
    Given saya mempunyai url create category
    When saya request url dan header serta parameter
    Then berhasil menambahkan kategori dengan status 200 OK


  Scenario: API create category dengan mengosongkan parameter
    Given saya mempunyai url create category
    When saya request url dan header serta emtpy parameter
    Then gagal menambahkan category dengan status code 500

  Scenario: API create category dengan mengosongkan parameter name dan mengisi description
    Given saya mempunyai url create category
    When saya request url dan header serta mengosongkan parameter name dan mengisi description
    Then gagal menambahkan category dengan status code 500


  Scenario: API create category dengan mengosongkan parameter description dan mengisi name
    Given saya mempunyai url create category
    When saya request url dan header serta mengosongkan parameter description dan mengisi name
    Then berhasil menambahkan kategori dengan status 200 OK


  Scenario: API create category dengan parameter invalid
    Given saya mempunyai url create category
    When saya request url dan header serta parameter tanpa token
    Then berhasil menambahkan kategori dengan status 401 Unauthorized
