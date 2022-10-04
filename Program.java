package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
				
		System.out.println("How many rooms will be rented? ");
		//Lê a quantidade de quartos a ser alugados//
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			//pula linha//
			sc.nextLine();
			//Lê o nome//
			String name = sc.nextLine();
			System.out.println("Email: ");
			//Lê o email//
			String email = sc.next();
			System.out.print("Room: ");
			//Lê o numero do quarto//
			int roomNumber = sc.nextInt();
			//instancia na memória uma nova locação com os dados nome e email//
			
			vect[roomNumber] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();

	}

}
