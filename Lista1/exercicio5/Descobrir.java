package lista1ex5;

import java.util.Random;

public class Descobrir {
	
	private int valor;
	private boolean acertou;
	
	public Descobrir() {
		// TODO Auto-generated constructor stub
	}
	public void geraNum(){
		Random random = new Random();
		this.valor = random.nextInt(10);
	}
	public void chutaNum(int valor){
		if(valor == this.valor){
			System.out.print("Voce Acertou. O numero era: " + this.valor);
			this.acertou = true;
		}
		else if(valor > this.valor){
			System.out.print("O numero e menor!\n");
			this.acertou = false;
		}
		else{
			System.out.print("O numero e maior!\n");
			this.acertou = false;
		}
	}
	public boolean getAcertou(){
		return this.acertou;
	}
}
