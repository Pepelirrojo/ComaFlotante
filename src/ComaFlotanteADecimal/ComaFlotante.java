package ComaFlotanteADecimal;

public class ComaFlotante {
	public static void main(String[] args) {	
		Funciones f = new Funciones();
		System.out.println("PROGRAMA PARA PASAR UN NUMERO EN COMA FLOTANTE DE PRECISIÓN SENCILLA A DECIMAL");
		f.resultFinal(f.esPositivo(), f.mantisa(f.exponente()));
	}
}
