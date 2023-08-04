Feature: Order Altashop
  Saya sebagai user
  Saya ingin melakukan proses order
  Saya bisa melanjutkan ke transaksi pembayaran


  Scenario: Halaman order menampilkan empty ketika user tidak melakukan order
    Given saya berada di halaman order
    When saya tidak melakukan pemesanan
    Then halaman order menampilkan empty


  Scenario: Barang yang dioder oleh user akan tampil di halaman order
    Given saya berada di halaman order
    When saya sudah memesan barang
    Then nama barang yang saya pesan akan tampil di halaman order
    And harga barang akan tampil di halaman order
    And total barang akan tampil dihalaman order

    Scenario: User dapat menambahkan jumlah barang
      Given saya berada di halaman order
      When saya klik icon tambah
      Then jumlah barang akan bertambah

      Scenario: User dapat mengurangi jumlah barang
        Given saya berada di halaman order
        When saya klik icon kurang
        Then jumlah barang akan berkurang