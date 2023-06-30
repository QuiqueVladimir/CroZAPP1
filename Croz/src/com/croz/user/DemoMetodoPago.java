package com.croz.user;
import com.croz.user.pagos.*;
public class DemoMetodoPago {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("prueba@gmail.com","prueba");
		//pago por Visa
		cuenta.pagar(new Visa(123456789,1234,"12/05/27"));
		//pago por Mastercard
		cuenta.pagar(new Master(987654321,4321,"20/06/28"));
		//cuenta por Paypal
		cuenta.pagar(new Paypal("test@gmail.com","12345","24/10/29"));
	}
}
