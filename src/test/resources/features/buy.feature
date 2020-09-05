Feature: Como cliente deseo iniciar sesión para realizar una compra

  @Buy
  Scenario: El cliente realiza una compra con su cuenta
    Given El cliente se encuentra el la pagina My Account
     When El cliente posiciona el puntero: producto
     Then El cliente verifica si el boton Add to cart fué desplegado

     When El clinte hace click en el boton: Add to cart
      And El cliente verifica si el boton Proceed to checkout-1 fué desplegado
     Then El clinte hace click en el boton: Proceed to checkout
      And El cliente verifica que fue redireccionado a la pagina SHOPPING-CART SUMMARY

     When El cliente verifica que hay un solo producto en su carrito
      And El clinte hace click en el boton: Proceed to checkout-2
     Then El cliente verifica que fue redireccionado a la pagina ADDRESSES
      And El clinte hace click en el boton: Proceed to checkout-3

     When El cliente verifica que fue redireccionado a la pagina SSHIPPING
      And El Cliente click en un check aceptando los terminos de servicio
     Then El clinte hace click en el boton: Proceed to checkout-4
      And El cliente verifica que fue redireccionado a la pagina PAYMENT

