package estruturadedecis�o;

import java.util.Scanner;

public class r1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leitor.nextInt();
		
		if(num > 20)
		System.out.println("Este n�mero � " +num);

	}

}
