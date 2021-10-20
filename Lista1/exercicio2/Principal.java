package lista1ex2;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double valor1, valor2;
		Operador operador = new Operador();
		int i=0;
		while(i==0){
			operador.printMenu();
			int escolha = leitor.nextInt();
			switch(escolha){
				case 1:
					System.out.print("\nInsira um numero real: ");
					valor1 = leitor.nextDouble();
					operador.getAbs(valor1);
				break;
				
				case 2:
					System.out.print("\nInsira um numero real: ");
					valor1 = leitor.nextDouble();
					operador.getTeto(valor1);
				break;
				
				case 3:
					System.out.print("\nInsira um angulo: ");
					valor1 = leitor.nextDouble();
					operador.getCos(valor1);
				break;
				
				case 4:
					System.out.print("\nInsira um numero real: ");
					valor1 = leitor.nextDouble();
					operador.getExp(valor1);
				break;
				
				case 5:
					System.out.print("\nInsira um numero real: ");
					valor1 = leitor.nextDouble();
					operador.getPiso(valor1);
				break;
				
				case 6:
					System.out.print("\nInsira um numero real:");
					valor1 = leitor.nextDouble();
					operador.getLn(valor1);
				break;
				
				case 7:
					System.out.print("\nInsira um numero real:");
					valor1 = leitor.nextDouble();
					System.out.print("\nInsira um numero real:");
					valor2 = leitor.nextDouble();
					operador.getMax(valor1,valor2);
				break;
				
				case 8:
					System.out.print("\nInsira um numero real:");
					valor1 = leitor.nextDouble();
					System.out.print("\nInsira um numero real:");
					valor2 = leitor.nextDouble();
					operador.getMin(valor1,valor2);
				break;
				
				case 9:
					System.out.print("\nInsira um numero real:");
					valor1 = leitor.nextDouble();
					System.out.print("\nInsira um numero real:");
					valor2 = leitor.nextDouble();
					operador.getPow(valor1,valor2);
				break;
				
				case 10:
					System.out.print("\nInsira um numero real:");
					valor1 = leitor.nextDouble();
					operador.getSqrt(valor1);
				break;
				
				case 11:
					System.out.print("\nEncerrando...");
					i = 1;
				break;
				
				default:
					System.out.print("\nEscolha invalida.");
				break;
			}
		}
	}

}
