/*
 * Agora essa classe classifica a quantidade de carros estacionados, adiciona e remove carros do estacionamento.
 */

package lista1ex4;

public class Estacionamento {

	//Variaveis de instancia
		private int quantidade;

		public Estacionamento(){
		}
		
		public Estacionamento(int quantidade){
			this.quantidade = quantidade;
		}
		public void estacionar(Carro carro){
			this.quantidade++;
		}
		public void sair(Carro carro){
			this.quantidade--;
		}

		
		public String toString(){
			return  "Existem " + this.quantidade + " carros estacionados\n";
		}
	}
