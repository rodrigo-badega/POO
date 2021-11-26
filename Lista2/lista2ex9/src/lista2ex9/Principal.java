package lista2ex9;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal extends JFrame {
	
	private JRadioButton b1,b2,sim,sair;
	private JLabel pergunta;
	private ButtonGroup op1,op2;
	private RadioButtonAltera altera;
	
	public Principal(){
	
	setLayout(null);
    altera = new RadioButtonAltera();
    
    pergunta = new JLabel("Voce foi sorteado! Deseja continuar?");
    	add(pergunta);
 		pergunta.setBounds(20,50,260,40);  
//    pergunta2 = new JLabel("\n Você realmente tem certeza disso?");
//    	add(pergunta2);
//			pergunta2.setBounds(40,220,220,20);
    
    op1 = new ButtonGroup(); 
    op2 = new ButtonGroup();
    
    b1 = new JRadioButton("Sim", false);
       op1.add(b1);
     	b1.setBounds(100,90,100,40);
     	
    b2 = new JRadioButton(" Nao", false);
        op1.add(b2);
     	 b2.setBounds(100,160,100,40);
 	 sair = new JRadioButton("Sair", false);    
   	op2.add(sair);
   	sair.setBounds(100,240,100,20);
    
    ArrayList<JRadioButton> lista = new ArrayList<JRadioButton>();    
       
    lista.add(b1);
    lista.add(b2);
    add(sair);
 	
    b1.addItemListener(altera);
    b2.addItemListener(altera);
    sair.addItemListener(altera);
  
    Iterator<JRadioButton> iRadio = lista.iterator();
       
    while (iRadio.hasNext()) {
    
        add((JRadioButton)iRadio.next());
    }
}

private class RadioButtonAltera implements ItemListener{
	
   public void itemStateChanged(ItemEvent event) {
   	
       if(b1.isSelected()) {
           JOptionPane.showMessageDialog(null,"Hackeado com sucesso!","Hackerman", JOptionPane.PLAIN_MESSAGE); 
           System.exit(1);
       
       }else if(b2.isSelected() ) {
        JOptionPane.showMessageDialog(null,"Hackeado com sucesso!","Hackeados.net", JOptionPane.PLAIN_MESSAGE); 
        System.exit(1);

       }else if(sair.isSelected()) {
           JOptionPane.showMessageDialog(null," Droga, voce conseguiu!"," Nao Hackeado", JOptionPane.PLAIN_MESSAGE); 
           System.exit(1);
      
      }
   }
}

public static void main (String args[ ]){
	
   Principal p = new Principal();
   
   p.setTitle(" SORTEIO INCRIVEL");
   p.setSize(300,400);
   p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   p.setLocationRelativeTo(null);
   p.setVisible(true);         
   
}
}
