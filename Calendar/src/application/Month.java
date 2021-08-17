package application;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {

		System.out.println("Digite o numero do mês: ");
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		String mes = "";

		while (opcao != 0) {

			switch (opcao) {

			case 1:
				mes = " Janeiro";
				break;
			case 2:
				mes = " Fevereiro";
				break;
			case 3:
				mes = " Março";
				break;
			case 4:
				mes = " Abril";
				break;
			case 5:
				mes = " Maio";
				break;
			case 6:
				mes = " Junho";
				break;
			case 7:
				mes = " Julho";
				break;
			case 8:
				mes = " Agosto";
				break;
			case 9:
				mes = " Setembro";
				break;
			case 10:
				mes = " Outubro";
				break;
			case 11:
				mes = " Novembro";
				break;
			case 12:
				mes = " Dezemmbro";
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
			System.out.println("Mês: " + mes);
			System.out.println("Digite o numero do mês: ");
			opcao = sc.nextInt();
		}
	}
}
