package estruturadedecisão;

import java.util.Scanner;

public class r2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,r;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite um número inteiro: ");
		n1 = leitor.nextInt();
		
		System.out.println("digite outro número inteiro: ");
		n2 = leitor.nextInt();
		
	
		r = n1 + n2;
		
		if(r > 10)
		System.out.println("resultado:" +r);
		
		

	}

}
