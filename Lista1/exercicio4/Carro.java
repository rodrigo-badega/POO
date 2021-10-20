/*
 * Faz a funcao da classe estacionamento no exercicio passado. Agora o preco e calculado por meio de um metodo.
 */

package lista1ex4;

import java.lang.Math;

public class Carro {
	
	public String tipo;
	public String placa;
	private float horario_entrada;
	private float horario_saida;
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public Carro(String tipo, String placa, float horario_entrada, float horario_saida) {
		this.tipo = tipo;
		this.placa = placa;
		this.horario_entrada = horario_entrada;
		this.horario_saida = horario_saida;
	}
	public void setHorario(float horario_in, float horario_out){
		this.horario_entrada = horario_in;
		this.horario_saida = horario_out;
	}
	
	public float getHoraIn(){
		return this.horario_entrada;
	}
	
	public float getHoraOut(){
		return this.horario_saida;
	}
	
	public void calculaPreco(){
		float resultado = Math.abs(this.horario_entrada - this.horario_saida);
		if(resultado*60 <= 30){
			System.out.println("Valor: Gratuito");
		}
		else if(resultado*60 <= 60){
			System.out.println("Valor: RS 10,00");
		}
		else{
			System.out.println("Valor: RS 20,00");
		}
	}
	
	public String toString(){
		return  "Tipo: " + this.tipo +
				" Placa: " + this.placa +
				" Entrada: " +this.horario_entrada +
				" Saida: " +this.horario_saida;}

}
