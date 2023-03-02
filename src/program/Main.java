package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra para inverter os caracteres: ");
		String palavra = sc.nextLine();
		String palavraInvertida = "";
		
		for(int i = 0; i < palavra.length(); i++) {
			palavraInvertida = palavra.charAt(i) + palavraInvertida;
		}
		
		System.out.println("Palavra: " + palavra);
		System.out.println("Palavra invertida: " + palavraInvertida);
	}

}
