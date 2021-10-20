package lista1ex5;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Descobrir aleatorio = new Descobrir();
		aleatorio.geraNum();
		while(aleatorio.getAcertou() == false){
			System.out.printf("Chute um valor de 0 a 10: ");
			int valor = leitor.nextInt();
			aleatorio.chutaNum(valor);
		}
	}
}
