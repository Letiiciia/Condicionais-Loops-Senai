package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		
		String maior;
		
		
		if(numero1 > numero2) {
			maior = "O maior n�mero � " + numero1;
		}else if(numero2 > numero1) {
			maior = "O maior n�mero � " + numero2;
		}else {
			maior = "N�meros iguais";
		}
		
		JOptionPane.showMessageDialog(null, maior);
	}
}
