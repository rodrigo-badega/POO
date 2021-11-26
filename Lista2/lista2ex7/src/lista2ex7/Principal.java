package lista2ex7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner( System.in );
        System.out.println("\nPalavra 1: ");
        String s1 = leitor.next();
        System.out.println("\nPalavra 2: ");
        String s2 = leitor.next();
        String resultado= null;
        BufferedReader arq = null;
        try{
        	arq = new BufferedReader(new FileReader("/tmp/ArquivoIndefinido"));
        } catch(IOException e){
        	//e.getStackTrace();
        	System.out.println(e.getMessage());
        
        try{
        resultado = s1+""+s2;
        } catch(NullPointerException ne){
        	ne.getStackTrace();
        	System.out.println(ne.getMessage());
        }
        try{
        	if(s1.length() <= 2 || s1.length() > 15 || s2.length() <=2 || s2.length() > 15){
    			throw new ExceptionB();
    		
    		}	else if(resultado.length() < 6 || resultado.length() > 30){
    				throw new ExceptionA();
    			} else{
    				System.out.println("Combinacao: " + resultado);
    			}
        		
        	} catch (ExceptionB eb){
        		e.getStackTrace();
            	System.out.println(eb.getMessage());
        	} catch (ExceptionA ea){
        		e.getStackTrace();
            	System.out.println(ea.getMessage());
        	}
        }

	}

}
