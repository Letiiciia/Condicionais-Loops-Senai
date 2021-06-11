package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

		String numeros = "";

		if (numero1 < numero2) {

			for (int i = (numero1 + 1); i < numero2; i++) {
				numeros += i + ", ";
			}
			
			System.out.println(numeros);
			
		} else if (numero1 > numero2) {

			for (int i = (numero1 - 1); i > numero2; i--) {
				numeros += i + ", ";
			}
		}

		JOptionPane.showMessageDialog(null, "Os números entre " + numero1 + " e " + numero2 + " são " + numeros);

	}
}
