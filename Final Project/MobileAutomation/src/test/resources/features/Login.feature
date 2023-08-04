#Feature: Login Altashop
#  Saya sebagai user
#  Saya ingin login di aplikasi altashop
#  Saya bisa mengakses halaman dashboard altashop
#
##  #Negative Testing
#  Scenario: User mengosongkan email & password
#    Given saya berada di halaman login altashop
#    When saya mengosongkan field email
#    And saya mengosongkan field password
#    And saya klik button login
#    Then muncul pesan email required
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi email invalid & mengosongkan password
#    Given saya berada di halaman login altashop
#    When saya mengisi email invalid
#    And saya klik button login
#    Then muncul pesan password required
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi password invalid & mengosongkan email
#    Given saya berada di halaman login altashop
#    When saya mengisi password invalid
#    And saya klik button login
#    Then muncul pesan email required
#    And saya tetap berada dihalaman login
#
# Scenario: User mengisi email valid & mengosongkan password
#    Given saya berada di halaman login altashop
#    When saya mengisi email valid
#    And saya klik button login
#    Then muncul pesan password required
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi password valid & mengosongkan email
#    Given saya berada di halaman login altashop
#    When saya mengisi password valid
#    And saya klik button login
#    Then muncul pesan email required
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi email valid & password invalid
#    Given saya berada di halaman login altashop
#    When saya mengisi email valid
#    And saya mengisi password invalid
#    And saya klik button login
#    Then muncul pesan record not found
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi email invalid & password valid
#    Given saya berada di halaman login altashop
#    When saya mengisi email invalid
#    And saya mengisi password valid
#    And saya klik button login
#    Then muncul pesan record not found
#    And saya tetap berada dihalaman login
#
#  Scenario: User mengisi email & password invalid
#    Given saya berada di halaman login altashop
#    When saya mengisi email invalid
#    And saya mengisi password invalid
#    And saya klik button login
#    Then muncul pesan record not found
#    And saya tetap berada dihalaman login
#
##  #Positive Testing
#  Scenario: User mengisi email & password valid
#    Given saya berada di halaman login altashop
#    When saya mengisi email valid
#    And saya mengisi password valid
#    And saya klik button login
#    Then halaman akan berpindah ke dashboard altashop
