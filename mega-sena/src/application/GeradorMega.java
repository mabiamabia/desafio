package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class GeradorMega {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();

		for (int i = 1; i < 60; i++) { // realiza loop de 1 a 60
			numeros.add(i);
		}
		int contador = 0;
		String flag = "";
		do {
			contador++;
			Collections.shuffle(numeros); // sorteia numeros
			List<Integer> escolhidos = numeros.subList(0, 6); // escolhe 6 digitos

			Collections.sort(escolhidos); // ordena lista

			System.out.println(escolhidos); // mostra lista na tela

			flag = JOptionPane.showInputDialog("Deseja gerar outro jogo? \n (S)sim \n(N)não");
		} while (flag.equalsIgnoreCase("s"));
		JOptionPane.showMessageDialog(null, "Você gerou " + contador + " jogo(s)");
	}
}