package controller;

public class InverterController {
	public InverterController() {
		super();
	}
	
	public String inverter(String entrada) {
		//Se não houver mais caracteres na variavel, retorna uma String vazia e para a chamada da recursiva.
        
		if (entrada.isEmpty()) {
            return "";
        } else {
        	//retorna-se o ultimo caractere da String e chama a recursiva, enviando uma substring que vai ate o penultimo caractere da String atual.
            
        	return entrada.charAt(entrada.length() - 1) + inverter(entrada.substring(0, entrada.length() - 1));
        }
    }
}
