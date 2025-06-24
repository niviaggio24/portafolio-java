Feature: PUT API Demo

  Background:
    * url 'https://reqres.in/api'
    * header Accept = 'application/json'

  Scenario: put demo 1
    Given path '/users/2'
    And request {"name": "morpheus","job": "zion resident" }
    When method PUT
    Then status 200
    And print response