Feature: Post API Demo

 Background:
   * url 'https://reqres.in/api'
   * header Accept = 'application/json'
   * def expectedOutput = read('../data/response1.json')

  #Simple post request
  Scenario: POST Demo 1
    Given url 'https://reqres.in/api/users'
    And request {"name": "Santi",  "job": "TM"}
    When method POST
    Then status 201
    And print response

  #Simple with background
  Scenario: POST Demo 2
    Given path '/users'
    And request {"name": "Santi",  "job": "TM"}
    When method POST
    Then status 201
    And print response

  #Simple with assertions
  Scenario: POST Demo 3
    Given path '/users'
    And request {"name": "Santi",  "job": "TM"}
    When method POST
    Then status 201
    And match response ==  {"name": "Santi",  "job": "TM",  "id":"#string",  "createdAt": "#ignore"}
    And print response

  #Post with read response from file
  Scenario: POST Demo 4
    Given path '/users'
    And request {"name": "Santi",  "job": "TM"}
    When method POST
    Then status 201
    And match response ==  expectedOutput
    And match $ ==  expectedOutput
    And print response
    And print expectedOutput

  #Post with read request body from file
  Scenario: POST Demo 5
    Given path '/users'
    And def projectPath = karate.properties['user.dir']
    And print projectPath
    And def filePath = projectPath+'\\src\\test\\java\\data\\request1.json'
    And print filePath
    And def requestBody = filePath
    And request requestBody
    When method POST
    Then status 201
    #And match response == expectedOutput
    And print response, expectedOutput
    #And match $ ==  expectedOutput
    And print response