Feature: Falabella's shopping
  As a user, i want to buy some items inside falabella's page


  @buy
  Scenario: Shopping
    Given User wants to open and search a item inside Falabella store
    When User got put the item Audífonos JBL T500BLKAM in  search place item
    And User got put the item ANTIOQUIA in department after BELLO in city and also town
    Then User can go to payment process

