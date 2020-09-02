Feature: Como cliente, quiero eingresar las credenciales de mi cuenta, para ingresar al sitio de compras

  @Login
   Scenario: El cliente inicia sesión en el sito de comptas
    Given e l cliente se encuentra en la pagina de home
    When el cliente hace click en el boton Sign in
    Then el cliente verifica que fué redireccionado a la pantalla de login

    When el cliente ingresa su emal: luisjivillalba@gmail.com
    And el cliente ingresa su password: asd123
    And el cliente hace click en el boton Sign in
    Then el cliente verifica que fué redireccionado a la pantalla de My Account

