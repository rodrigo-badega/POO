package lista1ex1;

import java.util.Scanner;

public class Principal {
	
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double valor1, valor2;
		Principal operador = new Principal();
		int i=0;
		while(i==0){
		System.out.print("|=======================================|"
					 + "\n|           Menu de Operacoes           |"
					 + "\n|1.  Absoluto                           |"
					 + "\n|2.  Arredondamento(teto)               |"
					 + "\n|3.  Cosseno                            |"
					 + "\n|4.  Exponencial                        |"
					 + "\n|5.  Arredondamento(piso)               |"
					 + "\n|6.  Logaritmo Natural                  |"
					 + "\n|7.  Maior                              |"
					 + "\n|8.  Menor                              |"
					 + "\n|9.  Potencia                           |"
					 + "\n|10. Raiz Quadrada                      |"
					 + "\n|11. Sair do Menu                       |"
					 + "\n|_______________________________________|");
		System.out.print("\nEscolha uma operacao: ");
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
	public void getAbs(double valor){
		System.out.print("\nResultado: " + Math.abs(valor) + "\n\n");
	}
	public void getTeto(double valor){
		System.out.print("\nResultado: " + Math.ceil(valor) + "\n\n");
	}
	public void getCos(double valor){
		System.out.print("\nResultado: " + Math.cos(valor) + "\n\n");
	}
	public void getExp(double valor){
		System.out.print("\nResultado: " + Math.exp(valor) + "\n\n");
	}
	public void getPiso(double valor){
		System.out.print("\nResultado: " + Math.floor(valor) + "\n\n");
	}
	public void getLn(double valor){
		System.out.print("\nResultado: " + Math.log(valor) + "\n\n");
	}
	public void getMax(double valor1, double valor2){
		System.out.print("\nMaior: " + Math.max(valor1, valor2) + "\n\n");
	}
	public void getMin(double valor1, double valor2){
		System.out.print("\nMenor: " + Math.min(valor1,valor2) + "\n\n");
	}
	public void getPow(double valor1, double valor2){
		System.out.print("\nResultado: " + Math.pow(valor1,valor2) + "\n\n");
	}
	public void getSqrt(double valor){
		System.out.print("\nResultado: " + Math.sqrt(valor) + "\n\n");
	}
}
