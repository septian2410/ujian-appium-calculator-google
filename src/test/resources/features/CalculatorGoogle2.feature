Feature: Calculator Google2

  Scenario Outline: Hitung Penjumlahan Sederhana dengan hasil puluhan & ratusan
    Given saya menekan tombol clear
    And saya menekan tombol <val1>
    And saya menekan tombol plus
    And saya menekan tombol <val2>
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil <result>

    Examples:
      | val1   | val2   | result |
      | 10     | 20     | 30     |
      | 200    | 30     | 230    |


