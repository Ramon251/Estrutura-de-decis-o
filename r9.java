package estruturadedecisão;

import java.util.Scanner;

public class r9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float valor;
		
		System.out.println("Qual o valor do produto?");
		valor = leitor.nextFloat();
		
		if(valor >= 20)
		System.out.println("lucro de 45%");
		else 
		System.out.println("lucro de 30%");
		
		
		
		

	}

}
