package lista1ex2;
/*
 * Essa classe tem por objetivo organizar a classe Principal, alem de introduzir um metodo para printar o menu.
 */
public class Operador {
	
	
	public Operador() {
		// TODO Auto-generated constructor stub
	}

	public void printMenu(){
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
