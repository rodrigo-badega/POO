package lista1ex3;

public class Principal {
	public Principal(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacionamento carro = new Estacionamento("Van", "PLN4312",12,15);
		if((carro.getHoraOut() - carro.getHoraIn())*60 <= 30){
			System.out.println("Valor: Gratuito");
		}
		else if((carro.getHoraOut() - carro.getHoraIn())*60 <= 60){
			System.out.println("Valor: RS 10,00");
		}
		else{
			System.out.println("Valor: RS 20,00");
		}
		System.out.print(carro);
	}
}
