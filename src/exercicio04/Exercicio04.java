package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio04 {
public static void main(String[] args) {
		
		String pAcessoVar = "Java-2021";
		String pAcesso = JOptionPane.showInputDialog("Digite a palavra de acesso: ");
		
		for(int i = 1; i <= 5; i++) {	
			if(!(pAcesso.equals(pAcessoVar))) {
				pAcesso = JOptionPane.showInputDialog("Digite a palavra de acesso corretamente: ");
			}
			if(pAcesso.equals(pAcessoVar)) {
				break;
			}
		}
		
	}
}
