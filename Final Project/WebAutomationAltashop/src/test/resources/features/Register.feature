Feature: Register Altashop
  Saya sebagai user
  Saya ingin register di aplikasi altashop
  Saya bisa login di apliaksi altashop

  #Negative Testing

  Scenario: User mengosongkan nama lengkap, email, password
    Given saya berada di halaman register altashop
    When saya mengosongkan inputan nama lengkap
    And saya mengosongkan inputan email
    And saya mengosongkan inputan password
    And saya klik button register
    Then muncul alert pesan email required
    And saya tetap berada dihalaman register

  Scenario: User mengosongkan nama lengkap dan mengisi email, password
    Given saya berada di halaman register altashop
    When saya mengosongkan inputan nama lengkap
    And saya mengisi inputan email
    And saya mengisi inputan password
    And saya klik button register
    Then muncul alert pesan nama lengkap required
    And saya tetap berada dihalaman register

  Scenario: saya mengosongkan email dan mengisi nama lengkap, password
    Given saya berada di halaman register altashop
    When saya mengosongkan inputan email
    And saya mengisi inputan nama lengkap
    And saya mengisi inputan password
    And saya klik button register
    Then muncul alert pesan email required
    And saya tetap berada dihalaman register

  Scenario: saya mengosongkan password dan mengisi nama lengkap, email
    Given saya berada di halaman register altashop
    When saya mengosongkan inputan password
    And saya mengisi inputan nama lengkap
    And saya mengisi inputan email
    And saya klik button register
    Then muncul alert pesan password required
    And saya tetap berada dihalaman register

#  Scenario: saya mengisi nama lengkap, password dan email tidak sesuai format email
#    Given saya berada di halaman register altashop
#    When saya mengisi inputan nama lengkap
#    And saya mengisi inputan password
#    And saya mengisi inputan email invalid format
#    And saya klik button register
#    Then muncul alert pesan password required
#    And saya tetap berada dihalaman register


    #Positive Testing

  Scenario: saya mengisi nama lengkap, password dan email
    Given saya berada di halaman register altashop
    When saya mengisi inputan nama lengkap baru
    And saya mengisi inputan password baru
    And saya mengisi inputan email baru
    And saya klik button register
    Then saya berada di halaman login altashop

  Scenario: Redirect link button order valid
    Given saya berada di halaman register altashop
    When saya klik button order
    Then halaman akan berpindah ke order altashop

  Scenario: Redirect link login valid
    Given saya berada di halaman register altashop
    When saya klik link login
    Then saya berada di halaman login altashop

  Scenario: Redirect link logo valid
    Given saya berada di halaman register altashop
    When saya klik logo altashop
    Then halaman akan berpindah ke dashboard altashop