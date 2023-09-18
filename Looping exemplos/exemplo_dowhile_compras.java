package setembro_14_loopings;

import java.util.Scanner;

public class exemplo_dowhile_compras {

	public static void main(String[] args) {
		
Scanner scn = new Scanner (System.in);

boolean continuar = true;


do {
	System.out.println("Deseja realizar outra compra?");
	char resposta = scn.next().charAt(0);
	
	if ( resposta == 's' || resposta == 'S') {
		continuar = true;
	}
	else {
		continuar = false;
	}
		
}while (continuar != false);

System.out.println("Fim do programa");


	}

}
