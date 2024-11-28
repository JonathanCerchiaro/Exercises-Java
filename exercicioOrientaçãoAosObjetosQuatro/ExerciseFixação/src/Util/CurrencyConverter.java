package Util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dolar, double buyDolar) {
		return dolar * buyDolar *(1.0 + IOF);
	}
}
