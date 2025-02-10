Feature: Calculator Google1

  Scenario: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear pada calculator
    And saya menekan tombol nilai pertama
    And saya menekan tombol plus pada calculator
    And saya menekan tombol nilai kedua
    And saya menekan tombol sama dengan pada calculator
    Then saya mendapatkan hasil "14"

