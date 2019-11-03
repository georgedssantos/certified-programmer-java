package com.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class QuebrarPartes {
	//10498.37030 97000.163044 00026.173575 3 75760000024862
	public String BreakStringParts(BigInteger valor){
		 String text = valor.toString();
		 List<String> strings = new ArrayList<String>();
		 int qtdMax = 5;
		 int index = 0;
		 while (index<text.length()) {
		 strings.add(text.substring(index, Math.min(index+qtdMax,text.length())));
		 index+=qtdMax;
	 }
	 String retorno = "";
	 for(int i=0; i<strings.size(); i++){
	 	retorno += strings.get(i).toString()+" ";
	 }
	 	return retorno;
	 }
}
