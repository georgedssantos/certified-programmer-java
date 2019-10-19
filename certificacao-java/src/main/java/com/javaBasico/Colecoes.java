package com.javaBasico;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colecoes {
	
	public static void main(String[] args) {

        Map<String, Estado> mapEstados = new HashMap<>();
        
        mapEstados.put("Nordeste", new Estado(Arrays.asList("Bahia", "Pernambuco")));
        mapEstados.put("Sudeste", new Estado(Arrays.asList("São Paulo", "Rio de Janeiro")));
		
		if (mapEstados != null) {
			
			for (String key : mapEstados.keySet()) {
				System.out.println("Região: "+ key);
				
	        	Estado estado = (Estado) mapEstados.get(key);
	        	
	        	for (String string : estado.nomes) {
	        		System.out.println("Estado: "+ string);  
				}
			}
					
		}

    }
	
	static class Estado {
		List<String> nomes;
		public Estado(List<String> nomes) {
			super();
			this.nomes = nomes;
		}
	}
}
