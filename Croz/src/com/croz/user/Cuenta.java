package com.croz.user;
import com.croz.user.pagos.*;

public class Cuenta {
	private String Correo;
	private String Contrase�a;
	/*private Plan plan;*/
	
	public Cuenta(String correo, String contrase�a) {
		this.Correo = correo;
		this.Contrase�a = contrase�a;
	}
	public void pagar(StrategyMedioPago medioPago) {
		medioPago.pagar();
	}
	public String getcorreo() {
		return Correo;
	}
	public String getContrase�a() {
		return Contrase�a;
	}
}

