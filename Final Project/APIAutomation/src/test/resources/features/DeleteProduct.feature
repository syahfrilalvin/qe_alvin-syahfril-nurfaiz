Feature: API Delete Product

  Scenario: API delete product valid
    Given saya mempunyai url delete product
    When saya request url dan header serta id valid
    Then berhasil menghapus product by id  dengan status 200 OK

  Scenario: API Delete Product dengan tanpa authorization token
    Given saya mempunyai url delete product
    When request API delete product tanpa authorization token
    Then gagal delete product status 401


  Scenario: API delete product invalid
    Given saya mempunyai url delete product
    When saya request url dan header serta id invalid
    Then data tidak ditemukan dengan status 400