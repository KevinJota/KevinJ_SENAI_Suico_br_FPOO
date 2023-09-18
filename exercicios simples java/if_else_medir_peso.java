package agosto24;

public class if_else_medir_peso {

	public static void main(String[] args) {
		double peso = 75;
		double altura = 1.68;
		
		double imc = peso / Math.pow(altura, 2);
		
		
		if (imc<18.5) {
			System.out.println("abaixo do peso");
		}
		else if(imc<24.9){
			System.out.println("peso normal");
		}
		else if(imc<29.9){
			System.out.println("sobrepeso");
		}
		else if(imc<34.9){
			System.out.println("obesidade grau I");
		}
		else{
			System.out.println("obesidade grau II");
		}

		
		
		
	}

}
