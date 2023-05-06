# Author: Me
# Language: English

Feature: Consultar la pagina principal de la U de A
  Como estudiante de la udea necesito buscar la homepage de la U en Google para ingresar al sitio oficial

  Scenario: Buscar la pagina oficial de la U de A en Google
    Given que me encuentro en la pagina de Google
    When escribo la sentencia U de A
    Then puedo ver el link de la pagina oficial
