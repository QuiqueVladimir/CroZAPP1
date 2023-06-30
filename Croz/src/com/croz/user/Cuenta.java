package com.croz.user;
import com.croz.user.pagos.*;

public class Cuenta {
	private String Correo;
	private String Contraseña;
	/*private Plan plan;*/
	
	public Cuenta(String correo, String contraseña) {
		this.Correo = correo;
		this.Contraseña = contraseña;
	}
	public void pagar(StrategyMedioPago medioPago) {
		medioPago.pagar();
	}
	public String getcorreo() {
		return Correo;
	}
	public String getContraseña() {
		return Contraseña;
	}
}

