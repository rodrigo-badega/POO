package lista2ex8;

import javax.swing.JOptionPane;

public class GUI {
	
	public float somaValores(float n1, float n2){
		return n1+n2;
	}
	
	public void criarInterface(){
		String sn1 = JOptionPane.showInputDialog("Digite o numero1: ");//retorno: string
		String sn2 = JOptionPane.showInputDialog("Digite o numero2: ");//retorno: string
		
		float n1=0, n2=0;
		try {
			n1 = Float.parseFloat(sn1);//String --> Float
			n2 = Float.parseFloat(sn2);//String --> Float
		} catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			n1=0;
			n2=0;
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		float n3 = somaValores(n1,n2);
		JOptionPane.showMessageDialog(null, 
				"Soma dos valores inseridos: " + n3, 
				"Soma simples", JOptionPane.PLAIN_MESSAGE); 
	}
	
	public GUI() {
		criarInterface();
	}
	
	public static void main(String[] args) {
		new GUI();
			

	}

}