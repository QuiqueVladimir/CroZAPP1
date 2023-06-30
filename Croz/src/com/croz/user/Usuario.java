package com.croz.user;
import java.util.ArrayList;
import java.util.List;
import com.corz.lugar.Lugar;
import com.croz.itinerario.*;

public class Usuario {
	private Cuenta cuenta;
	private String ubicacion;
	private List<Lugar> lugaresDibujados;
	private List<Lugar> lugaresSinConexion;
	private List<Lugar> lugaresFavoritos;
	private Itinerario 	itinerario;
	private List<String> etiquetas;
	public Usuario() {
		lugaresDibujados = new ArrayList<>();
		lugaresSinConexion = new ArrayList<>();
		lugaresFavoritos = new ArrayList<>();
	}
	
	public void obtenerUbicacion() {}
	public void buscar() {}
	public void busquedaAvanzada() {}
	public void crearItinerario() {}
	public void dibujarEnMapa() {}
	public void modificarPerfil() {}
	public void recuperarContraseña() {}
	
}
