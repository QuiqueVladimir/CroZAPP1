package com.croz.lugar.mapa;

public class ZonaFactory {
	public ZonaInteres getZona(String ZonaType) {
		if(ZonaType == null) {
			return null;
		}
		if(ZonaType.equalsIgnoreCase("Cajero")) {
			return new Cajero();
		} else if (ZonaType.equalsIgnoreCase("PuestoComida")) {
			return new PuestoComida();
		}else if(ZonaType.equalsIgnoreCase("ServH")) {
			return new ServH();
		}else if(ZonaType.equalsIgnoreCase("Tienda")) {
			return new Tienda();
		}
		return null;
	}
}
