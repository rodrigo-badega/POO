package lista2ex7;

public class ExceptionB extends ExceptionA {
	
	public ExceptionB(){
		super("Nome possui menos de tres caracteres ou mais do que quinze.\n");
	}
	
	public ExceptionB(String msg) {
		super(msg);
	}

}
