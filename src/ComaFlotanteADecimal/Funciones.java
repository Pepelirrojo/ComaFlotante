package ComaFlotanteADecimal;

import java.util.Scanner;

public class Funciones {
	Scanner sc = new Scanner(System.in);

	boolean esPositivo() {
		boolean rspta = false;
		System.out.println("Dime el signo [1 o 0] : ");
		int signo = sc.nextInt();
		while (signo != 0 && signo != 1) {
			System.out.println("Dime el signo [1 o 0] : ");
			signo = sc.nextInt();
		}
		if (signo == 0) {
			rspta = true;
		}
		return rspta;
	}

	long Exponente() {
		
		long num, aux, digit, decimal;
		int expo;
		boolean esBinario;
		do {
			System.out.print("Introduce el exponente en binario: ");
			num = sc.nextLong();
			esBinario = true;
			aux = num;
			while (aux != 0) {
				digit = aux % 10;
				if (digit != 0 && digit != 1) { 
					esBinario = false; 
				}
				aux = aux / 10;
			}
		} while (!esBinario);
		expo = 0;
		decimal = 0;
		while (num != 0) {
			
			digit = num % 10;
			
			decimal = decimal + digit * (int) Math.pow(2, expo);
			
			expo++;
			
			num = num / 10;
		}
		decimal -= 127;
		return decimal;
	}
	void Mantisa(long decimal) {
		System.out.println("Introduce la Mantisa: [ej: 0,x] ");
		float mant = sc.nextFloat();
		float result;
		while (mant > 0.2) {
			System.out.println("Introduce la Mantisa: [ej: 0,x] ");
			mant = sc.nextFloat();
		}
		mant += 1;
		result = (float) (mant * (Math.pow(2, decimal)));
		System.out.println(result);
	}

}
