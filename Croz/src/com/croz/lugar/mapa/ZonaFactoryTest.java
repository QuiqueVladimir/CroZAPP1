package com.croz.lugar.mapa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZonaFactoryTest {

	@Test
	void testGetZona() {
		ZonaFactory zonaFactory = new ZonaFactory();
		ZonaInteres zona2 = zonaFactory.getZona("Cajero");
		zona2.draw();
		assertEquals("Cajero", zona2.tipo());
	}
	@Test
	void testGetZona2() {
		ZonaFactory zonaFactory = new ZonaFactory();
		ZonaInteres zona2 = zonaFactory.getZona("Tienda");
		zona2.draw();
		assertEquals("Tienda", zona2.tipo());
	}
	@Test
	void testGetZona3() {
		ZonaFactory zonaFactory = new ZonaFactory();
		ZonaInteres zona2 = zonaFactory.getZona("ServH");
		zona2.draw();
		assertEquals("ServH", zona2.tipo());
	}

}
