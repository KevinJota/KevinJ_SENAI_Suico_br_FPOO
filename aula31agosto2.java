package agosto25;

import java.util.Scanner;

public class aula31agosto2 {

	public static void main(String[] args) {
		
    Scanner scn = new Scanner(System.in);
		
    //entrada das variaveis
		System.out.println("Insira o primeiro valor: ");
		int num1 = scn.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		int num2 = scn.nextInt();
		
		System.out.println("Insira o terceiro valor: ");
		int num3 = scn.nextInt();
		
	//maior valor aqui
		if( num1 == num2 && num2 == num3 ) {
			System.out.println("Os numeros sao iguais, nao existe um maior");
		}
		else {
		 if(num1>num2 && num3<num1) {
			System.out.println("O numero "+num1+" é o maior");
		 }
		 else if(num2>num1 && num3<num2) {
			System.out.println("O numero "+num2+" é o maior");
		}
		 else {
			System.out.println("O numero "+num3+" é o maior");
		 }
		}
	//menor valor aqui
		if( num1 == num2 && num2 == num3 ) {
			System.out.println("Os numeros sao iguais, nao existe um menor");
		}
		else {
		
		if(num1<num2 && num3>num1) {
			System.out.println("O numero "+num1+" é o menor");
		}
		else if(num2<num1 && num3>num2) {
			System.out.println("O numero "+num2+" é o menor");
		}
		else {
			System.out.println("O numero "+num3+" é o menor");
		 }
		}
		//soma das variaveis
		int somados3 = num1 + num2 + num3;
		System.out.println("A soma dos valores terá como resultado: "+somados3);
		
		//média entre as variaveis
		float media = somados3 / 3;
		System.out.println("A média entre os valores será de: "+media);
		
		//impar ou par?
		if(num1 % 2 == 0) {
			System.out.println("este "+num1+" é um numero par");
		}else {
			System.out.println("este "+num1+" é um numero impar");
		}
		if(num2 % 2 == 0) {
			System.out.println("este "+num2+" é um numero par");
		}else {
			System.out.println("este "+num2+" é um numero impar");
		}
		if(num3 % 2 == 0) {
			System.out.println("este "+num3+" é um numero par");
		}else {
			System.out.println("este "+num3+" é um numero impar");
		}
		
		//Negativo, positivo ou neutro?
		if(num1 > 0) {
			System.out.println("este "+num1+" é um numero positivo");
		}else if(num1 < 0){
			System.out.println("este "+num1+" é um numero negativo");
		} else {
			System.out.println("este "+num1+" é um numero neutro");
		}
		if(num2 > 0) {
			System.out.println("este "+num2+" é um numero positivo");
		}else if(num2 < 0){
			System.out.println("este "+num2+" é um numero negativo");
		} else {
			System.out.println("este "+num2+" é um numero neutro");
		}
		if(num3 > 0) {
			System.out.println("este "+num3+" é um numero positivo");
		}else if(num3 < 0){
			System.out.println("este "+num3+" é um numero negativo");
		} else {
			System.out.println("este "+num3+" é um numero neutro");
		}
	}
	}
		
		
	
		


