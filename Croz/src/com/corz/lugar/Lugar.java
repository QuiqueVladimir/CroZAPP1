package com.corz.lugar;
import com.croz.lugar.mapa.*;
import com.croz.lugar.mapa.resena.*;
import java.util.ArrayList;
import java.util.List;

public class Lugar {
	private String nombre;
	private List<Mapa> nivel;
	private String horario;
	private Clima tiempo;
	private Resena resena;
	private TopLugares toplugares;
	private String creador;
	private String descripcion;

	public Lugar(String name, List<Mapa> lvl, String schedule, Clima time, Resena review, TopLugares topplaces, String creator, String description){
		this.nombre = name;
		nivel = new ArrayList<>();
		this.horario = schedule;
		this.tiempo = time;
		this.resena = review;
		this.toplugares = topplaces;
		this.creador = creator;
		this.descripcion = description;
		
	}
	public void obtenerBeneficios() {
		
	}
	public void calculaCosto() {
		
	}
}