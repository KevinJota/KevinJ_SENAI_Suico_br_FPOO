package setembro_14_loopings;

public class exemplo_loop_for {

	public static void main(String[] args) {
	
		
		
	//este aqui é o loop FOR, dentro das "()" ele declara sua variavel primeiro,
	//depois a sua condição e a instrução caso a condição seja verdadeira ele ira repetir até que seja falso
		
		
	for ( int i = 0; i < 5; i++) { // esta chaves engloba o processo do for caso tenha condição verdadeira
		
		if (i % 2 == 0) {
		  System.out.println("número par "+i);
	  } else {
		  System.out.println("número impar "+i);
	  }
	}   // esta chaves engloba o processo do for caso tenha condição verdadeira	
		
		System.out.println("O for acabou "); //tudo e qualquer coisa fora das chaves do FOR só aparecerá
		                                     //quando  a condição do FOR der Falso

		
		
		

	}

}
