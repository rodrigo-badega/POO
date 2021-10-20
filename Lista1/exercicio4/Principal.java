package lista1ex4;

public class Principal {
	
	public float tempo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro("Van", "PLN4312",12,15);
		Estacionamento estacionamento = new Estacionamento(0);
		estacionamento.estacionar(carro);
		System.out.println(estacionamento.toString());
		estacionamento.sair(carro);
		System.out.println(estacionamento.toString());
		System.out.println(carro.toString());
		carro.calculaPreco();
	}
}
