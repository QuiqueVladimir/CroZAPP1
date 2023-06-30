package com.croz.lugar.mapa;

public class PuestoComida implements ZonaInteres {
	private String nombre;
	private String icon;
	private int cordenadas[];
	private String descripcion;
	private int horario[];
	private String etiquetas[];
	
	public PuestoComida() {
		
	}
	public String tipo() {
		return "PuestoComida";
	}
	public void draw() {
		System.out.println("Puesto de comida se muestra en mapa");
	}
	public int[] setCoordenadas() {
		return cordenadas; 
	}
	public void modificar() {
		
	}
}
