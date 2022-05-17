package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion[] champion = new Champion[2];
		
		
		for(int i = 0; i < 2; i++) {
			String orderChampion;
			if(i == 0) {
				orderChampion = "primeiro";
			} else {
				orderChampion = "segundo";
			}
			System.out.println("Digite os dados do " + orderChampion + " campeão:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.print("Aramadura: ");
			int armor = sc.nextInt();
			champion[i] = new Champion(name, life, attack, armor);
			System.out.println();
		}
		
		System.out.print("Quantos turnos você deseja excultar? ");
		int rounds = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < rounds; i++) {
			System.out.println("Resultado do turno " + (i+1) + ":");
			
			champion[0].takeDamage(champion[1]);
			
			champion[1].takeDamage(champion[0]);
			
			
			for(int j = 0; j < 2; j++) {
				System.out.println(champion[j].Status());
			}
			
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();
	}

}
