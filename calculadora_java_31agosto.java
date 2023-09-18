package agosto25;

import java.util.Scanner;

public class calculadora_java_31agosto {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	char escolher = 's';
	
	do {
	
		//entrada das variaveis
		 System.out.println("digite o primeiro valor á calcular: ");
		 int valor1 = scn.nextInt();
		 
		 System.out.println("digite o operador aritmético que deseja usar(+,-,*,/): ");
		 char op = scn.next().charAt(0);
		 
		 System.out.println("digite o segundo valor á calcular: ");
		 int valor2 = scn.nextInt();
		 
		 //??
		 int resultado = 0;
	 
	 
		 //estrutura de decisão da variavel op(OPERADOR)
		if(op== '+') {
			 resultado = valor1 + valor2;}
		
		else if(op== '-') {
			 resultado = valor1 - valor2;}
		
		else if(op== '/') {
			 resultado = valor1 / valor2;}
		
		else if(op== '*') {
			 resultado = valor1 * valor2;}
		else {
			System.out.println("Operador inválido ou inexistene");
		}
	
		  //saida;resultado do calculo
         System.out.println("Resultado: "+ resultado );
         
         System.out.println("Deseja usar a calculadora novamente(DIGITE 'S' PARA SIM E 'N' PARA NÃO?");
         escolher = scn.next().charAt(0);
      } while (escolher == 's' || escolher == 'S');
	
		System.out.println("Fim do programa");
    
         
  }
}