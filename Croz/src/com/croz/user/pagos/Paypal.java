package com.croz.user.pagos;

public class Paypal implements StrategyMedioPago{
	private String Correo;
	private String Contrase�a;
	private String DateExp;
	
	public Paypal(String correo, String contrase�a, String dExp) {
		this.Correo=correo;
		this.Contrase�a=contrase�a;
		this.DateExp=dExp;
	}
	public void pagar() {
		System.out.println("\nSe us� el metodo de pago Paypal\nCorreo: " + Correo + "\nContrase�a: " + Contrase�a + "\nFecha de vencimiento: " + DateExp);
	}
}
