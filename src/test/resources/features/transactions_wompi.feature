# language: es
# encoding: UTF-8

@Test
Característica: Transaccion IPG
  como empleado bancario
  puedo realizar transacciones
  para tener registros en IPG

  Antecedentes: Inicio de sesion
    Dado que se ingresa la credencial de acceso

  @PruebaManual
  Escenario: Transaccion IPG - wompi
    Cuando se completa el formulario de terminal virtual
    Entonces se debe aprobar la transaccion
    Y generar registro