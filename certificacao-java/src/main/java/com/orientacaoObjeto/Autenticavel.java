package com.orientacaoObjeto;

interface Autenticavel {
	boolean autentica(int senha);
}
	
class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	public boolean autentica(int senha) {
		if(this.senha != senha) {
			return false;
		}
		return true;
	}
}
	
	
	