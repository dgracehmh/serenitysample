@Sample2
Feature: CCE integration

  Background:
    Given The user launchs Serenity site

  Scenario: Teacher user opens "We the People Now" Link
    When The user navigates to Documentation then to What Is Serenity
    Then The user can see Serenity Icon