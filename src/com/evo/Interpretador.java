package com.evo;


public class Interpretador {

	/**
	 * 
	 * @param n
	 * 	Valores de 0 a 9
	 * @return
	 */
	public String interpretarNumero(int n){
		switch (n){
		case 0:
			return "cero";
		case 2:
			return "dos";
		case 3:
			return "tres";
		case 4:
			return "cuatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "siete";
		case 8:
			return "ocho";
		case 9:
			return "nueve";
		default:
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return null;
			}
		} 
	}
}
