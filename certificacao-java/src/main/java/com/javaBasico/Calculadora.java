package com.javaBasico;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String args[]){//main
        String result = ""; // inicializei a variavel que vai receber os resultados
        int num;
        JOptionPane.showMessageDialog(null, "Bem Vindo(a) ao tutor de tabuada.\nVamos aprender a tabuada de multiplicação.");
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um numero para gerar a tabuada"));
        for (int i=0; i<=10; i++){//for
            int mult = num*i;

            result += num + " x " + i + " = " + mult + "\n"; // aqui vai armazenar todos resultados

        }

       JOptionPane.showMessageDialog(null, result); // aqui só mostra o resultado
    }
}
