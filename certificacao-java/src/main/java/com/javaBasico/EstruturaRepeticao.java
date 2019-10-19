package com.javaBasico;

public class EstruturaRepeticao {
	public static void main(String[] args) {
		outerloop();
		estrturaFor();
    }
	
	//break para o loop
	//continue executa o próximo laço
	
	static void estrturaFor() {
		for(int i=0; i<100;i++) {
			if(i>50 && i<60) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	//Rótulos em laços (labeled loops)
	static void outerloop() {
        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");
	}
	
	//Cuidado, mesmo dentro de um for ou similar, o continue e o break só funcionarão se forem relativos 
	//a um label dentro do qual estão, e do tipo for, do...while, switch ou while. 
	//Vale lembrar que switch só aceita break.
	void internalExterno() {
		external: for (int i = 1; i < 10; i++) {
			  internal: for (int j = 1; j < 10; j++) {
			    if (i * j == 25)    {
			        break external; // quebrando o for externo
			    }
			    if (i * j == 16) {
			        continue internal; // pulando um iteração do for interno
			    }
			} }
	}
	
	void anotherLoopLabel() {
	    myLabel:
	    for(int i=0;i < 10;i++) {
	        System.out.println("hi");
	    }
	    for(int i=0;i < 10;i++) {
	        //break myLabel; // compile error
	} }
	
	static void estrturaWhile () {
		int i = 1; // Inicialização
		while (i < 10) { // Condição
		    System.out.println(i); // Comandos
		    i++; // Atualização
		}
		
		int x = 1;
		while (x < 10) {
		    x++;
		    if (x == 5)
		        break; // sai do while com i valendo 5
		    System.out.println(x);
		}
		System.out.println("End");
	}
}
