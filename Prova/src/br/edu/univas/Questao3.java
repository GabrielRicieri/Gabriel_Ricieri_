package br.edu.univas;
import java.util.Scanner;
public class Questao3 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			float salario ;
			int[] pessoas = new int[10];
			float soma = 0;
			float total = 0;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o salario da pessoa  " + (i + 1));
				pessoas[i] = scan.nextInt();
				soma = soma + pessoas[i];
			}
			
			System.out.println("Total sem aumento: " + soma);

			total = soma * 15 / 100;
			
			System.out.println("Folha Salarial: "+total);
			
		}

	}

