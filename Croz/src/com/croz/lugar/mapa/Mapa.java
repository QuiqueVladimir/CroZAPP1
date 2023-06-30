package com.croz.lugar.mapa;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	private int nivel;
	private List<ZonaInteres> conjZonas;
	private List<Alerta> alertas;
	
	public Mapa() {
		alertas = new ArrayList<>();
		conjZonas = new ArrayList<>();
	}
	
	public void agregarAlerta() {
		Alerta alert = new Alerta();
		alertas.add(alert);
	}
	
	public void agregarZona(String dat) {
		ZonaFactory zonaFactory = new ZonaFactory();
		ZonaInteres Zona2 = zonaFactory.getZona(dat);
		conjZonas.add(Zona2);
	}
	public void exportar() {
		
	}
}
