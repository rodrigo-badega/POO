package lista2ex7;

public class ExceptionA extends Exception {
	
	public ExceptionA(){
		super("Erro nas strings recebidas");
	}
	
	public ExceptionA(String mensagem){
		super(mensagem);
	}
	

}
