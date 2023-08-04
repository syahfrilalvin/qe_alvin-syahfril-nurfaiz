Feature: Dashboard
  Saya sebagai user
  Saya ingin membeli, melihat detail, sorting barang
  Saya bisa mengelola halaman dashboard

#  Positive Testing
  Scenario: User dapat melakukan sorting barang
    Given saya berada di halaman login altashop
    When saya mengisi email valid
    And saya mengisi password valid
    And saya klik button login
    And halaman akan berpindah ke dashboard altashop
    And saya klik select dropdown list kategori
    And saya klik salah satu kategori
    Then barang by kategori akan tampil


  Scenario: User dapat melihat detail barang
    Given saya berada di halaman dashboard home altashop
    When saya klik select button detail
    Then barang detail akan tampil
#

  Scenario: User dapat menambahkan satu barang ke keranjang
    Given saya berada di halaman dashboard home altashop
    When saya klik button beli salah satu barang
    Then saya berhasil menambahkan satu barang ke keranjang

  Scenario: User dapat menambahkan lebih dari satu barang ke keranjang
    Given saya berada di halaman dashboard home altashop
    When saya klik button beli salah satu barang
    And saya klik lagi button salah satu barang
    Then saya berhasil menambahkan lebih dari satu barang

  Scenario: User dapat redirect ke halaman order valid
    Given saya berada di halaman dashboard home altashop
    When saya klik button order (keranjang)
    Then saya berhasil ke halaman order
#
  Scenario: User dapat redirect ke halaman dashboard valid
    Given saya berada di halaman dashboard home altashop
    When saya klik logo altashop
    Then saya berada di halaman dashboard home altashop


