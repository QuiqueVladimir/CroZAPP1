package com.croz.user.pagos;

public class Master implements StrategyMedioPago{
	private int CardNumber;
	private int CVV;
	private String DateExp;
	
	public Master(int cNum, int cvv, String dExp) {
		this.CardNumber=cNum;
		this.CVV=cvv;
		this.DateExp=dExp;
	}
	
	public void pagar() {
		System.out.println("\nSe us� el metodo de pago Mastercard\nNumero de Tarjeta: " + CardNumber + "\nCVV: " + CVV + "\nFecha de vencimiento: " + DateExp);
	}

}

