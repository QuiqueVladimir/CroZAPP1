package com.croz.lugar.mapa;

public class ZonaDemo {
	public static void main(String[] args) {
		ZonaFactory zonaFactory = new ZonaFactory();
		ZonaInteres Zona2 = zonaFactory.getZona("Cajero");
		Zona2.draw();
		
	}
}
