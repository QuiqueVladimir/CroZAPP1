package com.croz.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testCuenta() {
		Cuenta cuenta = new Cuenta("prueba@gmail.com","626343g");
		//verificar que el objeto no sea nulo
		assertNotNull(cuenta);
		
		//verificar que los atributos del objeto se haya inicializado
		assertEquals("prueba@gmail.com", cuenta.getcorreo());
		assertEquals("626343g", cuenta.getContraseña());
	}


}
