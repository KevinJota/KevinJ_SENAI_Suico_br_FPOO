package agosto25;

import java.util.Scanner;

public class decision_idade {

	public static void main(String[] args) {
		
   Scanner scn = new Scanner(System.in);
   
   System.out.println("Insira abaixo a idade humana que você deseja classificar:");
   int idade = scn.nextInt();
   
   if(idade<=12) {
	   System.out.println("Criança");	
   }
   if(idade>12) {
	   System.out.println("Adolescente");
   }
   if(idade>17) {
	   System.out.println("Adulto");
   }
	if(idade>59) {
		System.out.println("Especialista");
	}
		
				
				
	}

}
