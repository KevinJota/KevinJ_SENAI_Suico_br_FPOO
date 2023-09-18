package pratica08september;

import java.util.Scanner;

public class valor_numerico_inteiro {

public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);




  System.out.println("digite um valor numerico inteiro:");
  int valor = scn.nextInt();

  if (valor < 0 ) {
	 valor = -valor; }


 
 
 
System.out.println("O valor numérico positivo dele será "+valor);











	}

}
