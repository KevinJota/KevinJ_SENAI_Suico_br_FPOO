package agosto24;

import java.util.Scanner;

public class underline_Decision {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
	System.out.println("primeira nota:");
		float nota1 = scn.nextFloat();
		
	System.out.println("segunda nota:");
		float nota2 = scn.nextFloat();
		
		float media =(nota1 + nota2)/ 2;
		
		
		
		//exemplo de estrutura de decisão
		
		if(media >=5 ) {
			System.out.print(" APROVADO"  );
		}
		else if (media < 5) {
		    System.out.print(" REPROVADO");
	}
		else {
			System.out.print("RECUPERAÇÃO");
		}
	}
}
