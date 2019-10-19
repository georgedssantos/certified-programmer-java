package com.util;

import javax.swing.JOptionPane;

public class Tabela {

	public static void main(String[] args) {
		
		StringBuilder saida = new StringBuilder();
		saida.append("<html>");
		saida.append("<table border = '1'>");
		saida.append("<tr>");
		saida.append("<th>COLUNA 1</th>");
		saida.append("<th>COLUNA 2</th>");
		saida.append("<th>COLUNA 3</th>");
		saida.append("</tr>");

	    for (int i = 0; i < 10; i++) {
	    	saida.append("<tr>");
	    	saida.append("<td>" + i + "</td>");
	    	saida.append("<td>" + i + "</td>");
	    	saida.append("<td>" + i + "</td>");
	    	saida.append("</tr>");
	    }

	    saida.append("</table></html>");
	    JOptionPane.showMessageDialog(null,saida.toString());
	}
}
