package com.croz.lugar.mapa;

public class Tienda implements ZonaInteres {
	private String nombre;
	private String icon;
	private int cordenadas[];
	private String descripcion;
	private int horario[];
	private String etiquetas[];
	
	public Tienda() {
		
	}
	public String tipo() {
		return "Tienda";
	}
	public void draw() {
		System.out.println("Tienda se muestra en mapa");
	}
	public int[] setCoordenadas() {
		return cordenadas; 
	}
	public void modificar() {
		
	}
}
