package com.croz.user.pagos;

public class Visa implements StrategyMedioPago {
	private int CardNumber;
	private int CVV;
	private String DateExp;
	
	public Visa(int cNum, int cvv, String dExp) {
		this.CardNumber=cNum;
		this.CVV=cvv;
		this.DateExp=dExp;
	}
	
	public void pagar() {
		System.out.println("\nSe usó el metodo de pago Visa\nNumero de Tarjeta: " + CardNumber + "\nCVV: " + CVV + "\nFecha de vencimiento: " + DateExp);
	}
	
}
