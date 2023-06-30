package com.croz.lugar.mapa;

public class Cajero implements ZonaInteres {
	private String nombre;
	private String icon;
	private int cordenadas[];
	private String descripcion;
	private int horario[];
	private String etiquetas[];
	
	public Cajero() {
		
	}
	
	public void draw() {
		System.out.println("Cajero automatico se muestra en mapa");
	}
	public String tipo() {
		return "Cajero";
	}
	public int[] setCoordenadas() {
		return cordenadas; 
	}
	public void modificar() {
		
	}
}
