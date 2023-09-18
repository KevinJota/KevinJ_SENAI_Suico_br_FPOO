package pratica08september;

import java.util.Scanner;

public class ordem_de_maior {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);	

System.out.println("INSIRA NUMEROS INTEIROS DIFERENTES ENTRE ELES ABAIXO");	
	
System.out.println("digite o primeiro numero: ");	
int num1 = scn.nextInt();	
	
System.out.println("digite o segundo numero: ");	
int num2 = scn.nextInt();	
	
System.out.println("digite o terceiro numero: ");	
int num3 = scn.nextInt();	



//possibilidades
 if(num1>num2 && num3<num1 && num2>num3) {
   System.out.println(num3 +" e "+ num2 +" e "+ num1);	}

 else if(num1>num2 && num3<num1 && num3>num2) {
   System.out.println(num2 +" e "+ num3 +" e "+ num1);	}

 else if(num3>num2 && num1<num3 && num1>num2) {
   System.out.println(num2 +" e "+ num1 +" e "+ num3);	}

 else if(num3>num2 && num1<num3 && num2>num1) {
   System.out.println(num1 +" e "+ num2 +" e "+ num3);	}

 else if(num2>num1 && num3<num2 && num3>num1) {
   System.out.println(num1 +" e "+ num3 +" e "+ num2);	}

 else if(num2>num1 && num3<num2 && num1>num3) {
   System.out.println(num3 +" e "+ num1 +" e "+ num2);	}

 else {
	 System.out.println("ERRO: LEIA A PRIMEIRA MENSAGEM DIREITO E REINICIE O PROGRAMA");  }







//sinto que podia haver um jeito mais simplificado de fazer isso mas nao sei qual seria....
	}

}
