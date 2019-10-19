package com.javaBasico;

public class EstruturaCondicional {

	public static void main(String[] args) {
        String s1 = "s1";
        String s2 = s1.substring(0, 2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
	}
	
	public int method(int x) {
        if(x > 200) {
            return 5;
        }
        throw new RuntimeException();
    }
	
	void methodCase() {
		int option = 3;
		switch(option) {
		    case 1:
		        System.out.println("1");
		    case 2:
		        System.out.println("2");
		    default:
		        System.out.println("DEFAULT");
		    case 3:
		        System.out.println("3");
		}
	}
	
	void methodCaseBreak() {
		int v = 4;
		switch(v) {
		    case 1:
		        System.out.println("1");
		        break;
		    case 2:
		        System.out.println("2");
		        break;
		    default:
		        System.out.println("DEFAULT");
		        break;
		    case 3:
		    	System.out.println("3");
		    	break;
		}
	}
}
