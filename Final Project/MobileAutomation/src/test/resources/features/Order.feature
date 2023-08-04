Feature: Order Altashop
  Saya sebagai user
  Saya ingin melakukan proses order
  Saya bisa melanjutkan ke transaksi pembayaran


  Scenario: Halaman order menampilkan empty ketika user tidak melakukan order
    Given saya berada di halaman order
    When saya tidak melakukan pemesanan
    Then halaman order menampilkan empty


  Scenario: User menambahkan satu barang
    Given saya berada di halaman order
    When saya klik beli barang
    Then jumlah barang dikeranjang bertambah

  Scenario: User menambahkan lebih satu barang
    Given saya berada di halaman order
    When saya klik beli barang
    And saya klik barang lain
    Then jumlah barang dikeranjang bertambah lebih dari satu