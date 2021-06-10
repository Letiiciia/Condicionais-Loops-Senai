package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		
		String maior;
		
		
		if(numero1 > numero2) {
			maior = "O maior número é " + numero1;
		}else if(numero2 > numero1) {
			maior = "O maior número é " + numero2;
		}else {
			maior = "Números iguais";
		}
		
		JOptionPane.showMessageDialog(null, maior);
	}
}
