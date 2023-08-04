Feature: Logout Altashop
  Saya sebagai user
  Saya ingin keluar mengakhiri aktifitas di aplikasi altashop
  Saya bisa logout


  Positive Testing
  Dikarenakan scenario 1 error dan berpengaruh ke scenario 2 dan 3
  Untuk itu scenario 2 & 3 belum ditulis secara lengkap.
  Karena tidak ada element yang menjadi pembeda di icon user
  Icon user bentrok dengan icon order
  Baik dari id, path, dan classname semuanya sama sehingga menjadikan error
  Scenario: User logout dihalaman dashobard home
    Given saya berada di halaman login altashop
    When saya mengisi email valid
    And saya mengisi password valid
    And  saya klik button login
    And halaman akan berpindah ke dashboard altashop
    And saya klik icon user
    And muncul pop up berisi logout
    And saya klik logout
    Then saya berada di halaman login altashop

  Scenario: User logout dihalaman order home
    Given saya berada di halaman login altashop
    When saya mengisi email valid
    And saya mengisi password valid
    And  saya klik button login
    And halaman akan berpindah ke dashboard altashop
    And saya klik icon user
    And muncul pop up berisi logout
    And saya klik logout
    Then saya berada di halaman login altashop

  Scenario: User logout dihalaman order home
    Given saya berada di halaman login altashop
    When saya mengisi email valid
    And saya mengisi password valid
    And  saya klik button login
    And halaman akan berpindah ke dashboard altashop
    And saya klik icon user
    And muncul pop up berisi logout
    And saya klik logout
    Then saya berada di halaman login altashop

