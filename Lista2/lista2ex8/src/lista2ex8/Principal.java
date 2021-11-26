package lista2ex8;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	
	public class Carro {
		private String placa;
		private String modelo;
		
		public Carro(String placa, String modelo){
			this.placa = placa;
			this.modelo = modelo;
		}
		
		public String toString(){
			return "Placa: " + this.placa + " Modelo: " + this.modelo;
		}
	}
	
	public class Aviso{
		public Aviso(){
		}
		public void start(){
			System.out.println("Abertura do Estacionamento!");
		}
	}
	
	public class EstacionamentoFacade {
		private ArrayList<Carro> carros = null;
		private Aviso aviso = null;
		
		public void iniciar(){
			aviso = new Aviso();
			aviso.start();
			carros = new ArrayList<>();
			String modelo = JOptionPane.showInputDialog("Digite a placa: ");//retorno: string
			String placa = JOptionPane.showInputDialog("Digite o modelo: ");//retorno: string
			carros.add(new Carro(modelo, placa));
			for(Carro i : carros ){
				JOptionPane.showMessageDialog(null, i,"CARRO", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	public Principal() {
		EstacionamentoFacade estacionamento = new EstacionamentoFacade();
		estacionamento.iniciar();
	}

	public static void main(String[] args) {
		new Principal();

	}

}
