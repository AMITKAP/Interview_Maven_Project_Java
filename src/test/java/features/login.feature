Feature: This is login feature

   Scenario: Parametrization demo
      Given i say hello to "amit"

   Scenario Outline:Scenario outline demo
      Given i say hello to <name>

      Examples:
      |name|
      |"amit"|
      |"summit"|

   Scenario :Datatable demo
      Given i say hello to name
      |name|
      |amit|

