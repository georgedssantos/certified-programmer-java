package com.javaAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ordenacão {
	public static void main(String args[]) {
        List<String> ls = Arrays.asList("João", "José", "Maria", "Adam");
        ls.sort(String::compareTo);
        ls.forEach(System.out::println);
        
        final Set<NomeVO> nomes = getNomes();
        
        List<NomeVO> resultadoOrdenado = new ArrayList<>(nomes);
        
        //Collections.sort(resultadoOrdenado, Comparator.comparing(NomeVO::getNome)); 
        Collections.sort(resultadoOrdenado, Comparator.comparing(NomeVO::getNome).thenComparing(NomeVO::getEmail)); 
        
        for (NomeVO nomeVO : resultadoOrdenado) {
			System.out.println(nomeVO.getNome()+ " "+ nomeVO.getEmail());
		}
    }
	
	static Set<NomeVO> getNomes() {
		Set<NomeVO> nomes = new HashSet<NomeVO>();
		nomes.add(new NomeVO("João", "joao@email.com")); 
		nomes.add(new NomeVO("Maria", "maria@email.com")); 
		return nomes;
	}
	
	static class NomeVO {
		private String nome;
		private String email;
		public NomeVO(String nome, String email) {
			super();
			this.nome = nome;
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}


}

