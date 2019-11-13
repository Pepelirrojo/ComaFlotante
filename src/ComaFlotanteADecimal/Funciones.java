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
}
