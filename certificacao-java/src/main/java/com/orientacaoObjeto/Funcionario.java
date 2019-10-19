package com.orientacaoObjeto;

class Funcionario {
	protected double salario;
	double getBonificacao() {
		return this.salario * 0.20;
	}
	
}

class Gerente1 extends Funcionario {
	double getBonificacao() {
	return this.salario * 0.50;
	}
}
	

	
	
	