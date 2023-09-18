package agosto25;

import java.util.Scanner;

public class multa_velocidade {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Insira aqui a Velocidade em KM/H do veiculo registrado:");
		int velmedia = scn.nextInt();
		
		
		int vellimite = 50;
		
		int registrovel = velmedia - vellimite;
		
		
		System.out.println("LIMITE DE VELOCIDADE DA VIA:"+vellimite+"KM/H");
		System.out.println("Velocidade do veiculo registrado:"+velmedia+"KM/H");
		
		 if(registrovel>30) {
			System.out.println("Infração por excesso de velocidade registrada acima de 80km/h; Receberá multa de 200 R$");
		}
		 else if(registrovel>11) {
			System.out.println("Infração por excesso de velocidade registrada acima de 61km/h; Receberá multa de 100 R$");
		}
		 else if(registrovel>0) {
			System.out.println("Infração por excesso de velocidade registrada acima de 50km/h; Receberá multa de 50 R$");
		}
		else {
			System.out.println("Registrado Velocidade abaixo de 50km/h; Não houve infrações.");
		}
		
		
		
		
	}

}
