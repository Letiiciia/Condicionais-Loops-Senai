package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final:"));
		
		String situacao;
		
		if(nota >= 7) {
			situacao = "O aluno " + nome + " esta aprovado, com a nota " + nota;
		}else if(nota >= 4 && nota <= 7) {
			situacao = "O aluno " + nome + " esta de recuperação, com a nota " + nota;
		}else {
			situacao = "O aluno " + nome + " esta reprovado, com a nota " + nota;
		}
		
		JOptionPane.showMessageDialog(null, situacao);
		
	}

}
