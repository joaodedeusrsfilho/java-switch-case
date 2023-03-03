package com.junior.curso_java_basico.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Faca um programa e verifique se é vogal ou consoante a letra digitada
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma letra para saber se vogal ou consoate");
		String letraDigitada = ler.nextLine();
		if(letraDigitada.length()>1) {
			System.out.println("digite apenas uma letra");
		}else {
			switch (letraDigitada) {
			case "a":
			case "e":
			case "i":	
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":	
			case "O":
			case "U":
				System.out.println("Letra vogal");
				break;
				default:
					System.out.println("Letra consoante");
			}
		}
	}
}
