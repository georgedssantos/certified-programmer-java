package com.orientacaoObjeto;

public class Main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Funcionario funcionario = new Gerente();
	funcionario.salario = 1000.00;
	System.out.println(funcionario.getBonificacao());	
}

}
