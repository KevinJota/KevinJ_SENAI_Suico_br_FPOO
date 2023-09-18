package pratica08september;

import java.util.Scanner;

public class notasmédia {

public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
		

	System.out.println("HORA DE AVALIARMOS A MÉDIA DO ALUNO!");		
	
	System.out.println("insira a primeira nota do aluno");
	float nota1 = scn.nextFloat();
	
	System.out.println("insira a segunda nota do aluno");
	float nota2 = scn.nextFloat();
	
	System.out.println("insira a terceira nota do aluno");
	float nota3 = scn.nextFloat();
	
	System.out.println("insira a quarta nota do aluno");
	float nota4 = scn.nextFloat();
	
	
	
	
	   float mediaaprov = 7;			
	   float media1 =(nota1 + nota2 + nota3 + nota4)/4;
	
	   
	   
	System.out.println("Aluno obteve a média bimestral "+media1+" Logo ele está:");
	
	if(media1 >= mediaaprov) {
	  System.out.println("APROVADO!");
	     }
	
	
	else {
	  System.out.println("Em recuperação; Aluno deverá fazer exame de recuperação para obter quinta nota");
	  
	  
	  
	  System.out.println("insira a quinta nota do aluno");
		float nota5 = scn.nextFloat();
	  
		float medianova =(nota1 + nota2 + nota3 + nota4 + nota5)/4;
		
		
		if(medianova >= mediaaprov) {
			  System.out.println("Aprovado em exame de recuperação");
			}
		
		else {
			  System.out.println("REPROVADO");
		     }
		      System.out.println("Após exame de recuperação, a nova média bimestral do aluno foi de: "+media1);
	         }
	   
	
	}

}
