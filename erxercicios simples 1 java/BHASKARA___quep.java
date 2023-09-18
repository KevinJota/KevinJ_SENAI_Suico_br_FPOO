package pratica08september;

import java.util.Scanner;

public class BHASKARA___quep {

public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
 
System.out.println("HORA DE EXECUTAR CALCULOS EM BHASKARA!");

//entrada das variaveis para calcular deltha

  System.out.println("Insira o valor numerico A: ");
  double	valorA = scn.nextDouble();

  System.out.println("Insira o valor numerico B: ");
  double	valorB = scn.nextDouble();
		
  System.out.println("Insira o valor numerico C: ");
  double	valorC = scn.nextDouble();
		
    //calculando delta

  double delta = (valorB * valorB) - (4 * valorA * valorC);

  
   //avaliando o resultado de Delta
  
	if(delta<0) {
		System.out.println("Não há uma solução real");}
	
	else if(delta>0) {
		System.out.println("há duas soluções reais e diferentes");}	
	
	else	{
		System.out.println("há apenas uma solução real");}
		
		
	}

}
