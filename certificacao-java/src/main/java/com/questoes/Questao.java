package com.questoes;

public class Questao {
	/*
	 * 01 QUESTAO: Choose the appropriate option when trying to compile and run the
	 * following code: a) Compilation error. b) Compiles and rotates, printing from
	 * 0 to 19 and then 19. c) Compiles and rotates, printing from 0 to 19, then an
	 * error occurs execution. d) Compiles and rotates, printing from 0 to 19, then
	 * 19, then finished.
	 */
	    
	    public void questao01() {
	        for (int i = 0; i < 20; i++) {
	            System.out.println(i);
	        }
	        //System.out.println(i); //erro
	        
	        for (int i = 0; i < 20; i++)
	            System.out.println(i);
	            //System.out.println(i); //erro
	    }
	    
	/*
	 * 02 QUESTAO: Choose the appropriate option when trying to compile and run the
	 * following code: a) Compilation error on line 6. Variable i cannot be
	 * redeclared. b) Compilation error on line 7. Variable i is ambiguous. c)
	 * Compiles and rotates, printing from 0 to 19 and then 15. d) Compiles and
	 * rotates, printing from 0 to 19, then an error occurs run on line 6. e)
	 * Compiles and rotates, printing from 0 to 19 and then 19 again.
	 */
	    
	    
	    public static void questao02() {
	        for (int i = 0; i < 20; i++) {
	            System.out.println(i);
	        }
	        int i = 15;
	        System.out.println(i);
	    }
	    
	    /*
	    
	    03 QUESTAO:
	    Choose the appropriate option when trying to compile and run the following code:
	    a) Compilation error.
	    b) Compiles and rotates, printing from 0 to 19 and then 19.
	    c) Compiles and rotates, printing from 0 to 19, then an error occurs execution.
	    d) Compiles and rotates, printing from 0 to 19, then 19, then finished.
	    
	     */
}
