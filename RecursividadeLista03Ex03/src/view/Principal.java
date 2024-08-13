package view;

import controller.InverterController;

public class Principal {
	public static void main(String[] args) {
		InverterController ic = new InverterController();
		
		String entrada = "teste";
		String saida = ic.inverter(entrada);
		
		System.out.println("String invertida: " +saida);
	}
}
