package lista1ex3;

public class Estacionamento {

//Variaveis de instancia
	private String tipo;
	private String placa;
	private float horario_entrada;
	private float horario_saida;

	public Estacionamento(){
	}
	
	public Estacionamento(String tipo, String placa, float horario_in, float horario_out){
		cadastrar(tipo,placa,horario_in,horario_out);
	}
	
	public void cadastrar(String tipo, String placa, float horario_in, float horario_out){
		this.tipo = tipo;
		this.placa = placa;
		this.horario_entrada = horario_in;
		this.horario_saida = horario_out;
	}
	
	public float getHoraIn(){
		return this.horario_entrada;
	}
	
	public float getHoraOut(){
		return this.horario_saida;
	}
	
	public String toString(){
		return  "Tipo: " + this.tipo +
				" Placa: " + this.placa +
				" Chegada: " + this.horario_entrada +
				" Saida: " + this.horario_saida;
	}
}
