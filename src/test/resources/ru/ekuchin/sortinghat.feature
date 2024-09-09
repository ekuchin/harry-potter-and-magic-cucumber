Feature: The Sorting Hat is an artefact used to sort Hogwarts students into houses
  At the beginning of each school year, the Hat is placed on each first-year student's head
  The Hat announces whether the student will be assigned to Gryffindor, Hufflepuff, Ravenclaw or Slytherin.

  Scenario: Harry Potter goes to Gryffindor
    Given Student is Harry Potter
    When Sorting Hat makes it's decision
    Then Student goes to Gryffindor

  Scenario: Draco Malfoy goes to Slytherin
    Given Student is Draco Malfoy
    When Sorting Hat makes it's decision
    Then Student goes to Slytherin

  Scenario: Luna Lovegood goes to Ravenclaw
    Given Student is Luna Lovegood
    When Sorting Hat makes it's decision
    Then Student goes to Ravenclaw

  Scenario: Cedric Diggory goes to Hufflepuff
    Given Student is Cedric Diggory
    When Sorting Hat makes it's decision
    Then Student goes to Hufflepuff
