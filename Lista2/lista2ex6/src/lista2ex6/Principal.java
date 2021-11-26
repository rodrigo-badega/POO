package lista2ex6;

import java.util.Scanner;

public class Principal {

	public Principal() {
	}
	
	public static float divisao(int num, int denom) throws ExceptionA{
		float resultado = 0;
		if(denom == 0){
			throw new ExceptionB();
			
		}	else {
			resultado = (float) num/denom;
			if(resultado%2 != 0){
				throw new ExceptionC();
			}
			return resultado;
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner( System.in );
        System.out.println("\nNumerador: ");
        int num = leitor.nextInt();

        System.out.println("\nDenominador: ");
        int den = leitor.nextInt();
        float resultado=0;
		try {
			resultado = divisao(num, den);
		} catch (ExceptionA e){
			e.printStackTrace();
			//System.out.println(e);
			System.out.println("1)"+e.getMessage());
		} finally {
			System.out.println("Resultado: " + resultado);
		}
	}
}
