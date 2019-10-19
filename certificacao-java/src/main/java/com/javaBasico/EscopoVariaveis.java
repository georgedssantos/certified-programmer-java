package com.javaBasico;

public class EscopoVariaveis {
	
	/*
	 * ESCOPO DE VARIÁVEIS 
	 * VARIÁVEIS LOCAIS -> CHAMAMOS DE LOCAIS AS VARIÁVEIS
	 * DECLARADAS DENTRO DE BLOCOS, COMO DENTRO DE MÉTODOS OU CONSTRUTORES.
	 * 
	 * VARIÁVEIS DE INSTÂNCIA -> VARIÁVEIS DE INSTÂNCIA OU VARIÁVEIS DE OBJETO
	 * SÃO OS ATRIBUTOS DOS OBJETOS. SÃO DECLARADAS DENTRO DA CLASSE, MAS FORA DE
	 * QUALQUER MÉTODO OU CONSTRUTOR.
	 */
	
	public void m1() { // method - opening
	    int x = 10; // method local variable
	    if (x >= 10) { // if - opening
	        int y = 50; // if local variable
	        System.out.print(y);
	    } // if - closing
	} // method - closing
	
	// instance or object variable
    String name;
    static int count = 15;
    
    public void setName(String n) {
        // explicit (this) instance variable access
        this.name = n;
    }
    
    public void method(String par) {
        //int par = 0; // compilation error same name
        System.out.println(par); // which one?
        //static int id = 15; //compilation erro variable static in method local
    }

}
