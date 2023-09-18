package agosto24;
import java.util.Scanner;
public class Dolar_real {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		//ENTRADA
        System.out.println("Digite o valor em Dolar:");
		double dolar = scn.nextDouble();
		
		double taxacambio = 4.8;
		
		//PROCESSO DE CONVERSAO MULTIPLICACAO
		double real= dolar * taxacambio;
		
		System.out.println("A conversao de Dolar para Real gerou: "+real+"BRL");
		
		
	}

}
