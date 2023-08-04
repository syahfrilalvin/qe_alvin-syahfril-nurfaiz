Feature: API Get All Product

  Scenario: API get all product dengan request valid
    Given saya mempunyai url get all product
    When saya request url dan header valid
    Then berhasil mendapatkan all product dengan status 200 OK

    #Error karena status kode berhasil 200, tetapi didokumentasi harus ada token
  Scenario: API Get All Product dengan tanpa authorization token
    Given saya mempunyai url get all product
    When request tanpa authorization token
    Then gagal mendapatkan all product status 401