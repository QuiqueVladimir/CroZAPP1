package com.croz.lugar.mapa;

public class ServH implements ZonaInteres {
	private String nombre;
	private String icon;
	private int cordenadas[];
	private String descripcion;
	private int horario[];
	private String etiquetas[];
	
	public ServH() {
		
	}
	public String tipo() {
		return "ServH";
	}
	public void draw() {
		System.out.println("Servicio Higienico se muestra en mapa");
	}
	public int[] setCoordenadas() {
		return cordenadas; 
	}
	public void modificar() {
		
	}
}
