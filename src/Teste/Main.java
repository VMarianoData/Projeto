package Teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String endereco;
		int escolha = 0;
		Beneficiario bene = new Beneficiario();
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
		System.out.print("Kits disponiveis: ");
		System.out.println("Kit 1: 4 peças de roupa || 3 peças de roupa de cama || 2 mantimentos || 1 brinquedo");
		System.out.println("KIt 2: 3 peças de roupa || 1 peças de roupa de cama || 4 mantimentos || 1 brinquedo");
		System.out.println("Kit 3: 2 peças de roupa || 4 peças de roupa de cama || 3 mantimentos || 1 brinquedo");
		System.out.println("\nQual kit você deseja?");
		escolha = sc.nextInt();
			}
			catch(InputMismatchException f) {
			}
		
		
		if (escolha == 1) {
			System.out.println("Você escolheu o kit 1");
			
			
		}
		else if (escolha == 2) {
			System.out.println("Você escolheu o kit 2");
			
		}
		else if (escolha == 3) {
			System.out.println("Você escolheu o kit 3");
			
		}
		else {
			System.out.println("Ops... parece que não temos esse kit, por que não seleciona um outro?\n");
			continue;
			}
		
		} while(escolha > 3 );		
		
		
		sc.nextLine();
		System.out.println("Digite seu endereço: ");
		endereco = sc.nextLine();
		bene.setEndereco(endereco);
		
		System.out.println("Enviaremos para o endereço: " + bene.getEndereco());
		
		
		
		
		sc.close();
	}

}
