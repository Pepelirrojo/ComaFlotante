package ComaFlotanteADecimal;

import java.util.Scanner;

public class ComaFlotante {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el signo del primer numero en coma flotante: [0,1]");
		String s1 = sc.next();
		int ex1 = sc.nextInt();
		int mant1 = sc.nextInt();
		System.out.print(s1 + "|");
		System.out.print(ex1 + "|");
		System.out.print(mant1);
		if (s1 == "0") {
			s1 = "+";
		} else if (s1 == "1") {
			s1 = "-";
		} else {
			System.out.println("NO HAS METIDO NI 1 NI 0, REINICIA EL PROGRAMA");
		}
		{

		}
	}
}
