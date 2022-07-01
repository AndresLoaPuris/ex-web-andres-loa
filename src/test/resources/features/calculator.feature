@testfeature
  Feature: Calcular valores
    Scenario: Sumar dos numeros
      Given ingreso a la pagina BasciCalculator
      When ingreso el valor de primer numero: 4 y segundo numero: 2 y selecciono la operacion de sumar
      Then el valor deberia ser 6

    Scenario: Restar dos numeros
      Given ingreso a la pagina BasciCalculator
      When ingreso el valor de primer numero: 4 y segundo numero: 2 y selecciono la operacion de restar
      Then el valor deberia ser 2

    Scenario: Multiplicar dos numeros
      Given ingreso a la pagina BasciCalculator
      When ingreso el valor de primer numero: 4 y segundo numero: 2 y selecciono la operacion de multiplicar
      Then el valor deberia ser 8


    Scenario: Dividir dos numeros
      Given ingreso a la pagina BasciCalculator
      When ingreso el valor de primer numero: 4 y segundo numero: 2 y selecciono la operacion de dividir
      Then el valor deberia ser 2