package estruturadedecisão;

import java.util.Scanner;

public class r3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leitor.nextInt();
		
		if(num > 0)
        System.out.println(" Número positivo.");
		
		else if (num < 0)
		System.out.println("Número negativo.");
		
	}

}
