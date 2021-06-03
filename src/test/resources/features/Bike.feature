Feature: SQA-C39 Pagina de Ciclas
  Yo como usuario de bikesonline, quiero ir al buscador y buscar
  unas bicicletas, despues de ello seleccionarlas y validar
  los productos por precio correctamente.

  Scenario: Buscar bicicletas en el buscador de bikesonline exitoso
    Given que me encuentro en la pagina de bikesonline
    When busco diferentes modelos de ciclas en el buscador
    Then podre ver los productos buscados con su precio respectivo