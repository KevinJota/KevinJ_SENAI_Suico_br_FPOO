package agosto25;

import java.util.Scanner;

public class exemplo_05_profissao {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);	

	System.out.println("Digite uma profissão de 1 á 5");
	int prof = scn.nextInt();
	
	switch(prof) {
	case 1: System.out.println("Matematico"); break;
	case 2: System.out.println("Analista de sistemas"); break;
	case 3: System.out.println("Fisico"); break;
	case 4: System.out.println("Arquiteto"); break;
	case 5: System.out.println("Piloto de aeronaves"); break;
	default:
		System.out.println("Você digitou uma operação invalida.");
	}
	
	
	
	
	}

}
