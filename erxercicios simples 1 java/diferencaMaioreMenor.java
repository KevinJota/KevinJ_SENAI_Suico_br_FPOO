package pratica08september;

import java.util.Scanner;

public class diferencaMaioreMenor {

	public static void main(String[] args) {
		
    Scanner scn = new Scanner(System.in);

System.out.println("Insira o primeiro valor numerico inteiro:");
int valor1 = scn.nextInt();

System.out.println("Insira o segundo valor numerico inteiro:");
int valor2 = scn.nextInt();

int dif = 0;


if(valor1>valor2) {
     dif = valor1 - valor2;
     System.out.println("A diferenca entre os valores "+valor1+" e "+valor2+" e de :"+dif);}

else if(valor2>valor1) {
	 dif = valor2 - valor1;
	 System.out.println("A diferenca entre os valores "+valor2+" e "+valor1+" e de :"+dif);}
	
else {
	 System.out.println("Nao existe diferenca entre eles");}
  


	}
}
