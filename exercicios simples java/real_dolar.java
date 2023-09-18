package agosto24;

import java.util.Scanner;

public class real_dolar {

	
	//nomear variavel Real- Variavel taxa de cambio
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);

	 System.out.println("Digite o Valor em Reais:");
	 double real = scn.nextDouble();
	 
	 double taxacambio = 4.8;
	 
	 
	 
	 //PROCESSO DE CONVERSÃO
	 double dolar = real / taxacambio;
	 
	 System.out.println("A conversao de Real para Dolar gerou: "+dolar+"USD" );
	}

}
