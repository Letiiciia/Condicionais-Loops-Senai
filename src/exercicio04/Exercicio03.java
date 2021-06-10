package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número")); 
	
		for(int i = numero1; i > numero2; i++) {
			System.out.println(i);
		}
	
	
	}
}
