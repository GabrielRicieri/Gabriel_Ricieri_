package br.edu.univas;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		ArrayList<String> notes = new ArrayList<>();
		int i = 0;
		while (true) {
			System.out.println("Digite a nota");
			i = leitura.nextInt();

			if (i == 0)
				break;
			notes.add(whoNote(i));
			i++;
		}
		for (int j = 0; j < notes.size(); j++) {
			System.out.println(notes.get(j));
		}

	}

	public static String whoNote(int num) {
		if (num == 1)
			return "DO";
		else if (num == 2)
			return "RE";
		else if (num == 3)
			return "MI";
		else if (num == 4)
			return "FA";
		else if (num == 5)
			return "SOL";
		else if (num == 6)
			return "LA";
		else if (num == 7)
			return "SI";
		else
			return "";
	}

}