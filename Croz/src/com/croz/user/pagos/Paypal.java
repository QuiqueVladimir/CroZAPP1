package com.croz.user.pagos;

public class Paypal implements StrategyMedioPago{
	private String Correo;
	private String Contraseña;
	private String DateExp;
	
	public Paypal(String correo, String contraseña, String dExp) {
		this.Correo=correo;
		this.Contraseña=contraseña;
		this.DateExp=dExp;
	}
	public void pagar() {
		System.out.println("\nSe usó el metodo de pago Paypal\nCorreo: " + Correo + "\nContraseña: " + Contraseña + "\nFecha de vencimiento: " + DateExp);
	}
}
