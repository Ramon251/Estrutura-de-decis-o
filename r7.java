package estruturadedecisão;

import java.util.Scanner;

public class r7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome1,nome2;
		int idade1,idade2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome:");
		nome1 = leitor.next();
		
		System.out.println("Digite a primeira idade:");
		idade1 = leitor.nextInt();
		
		System.out.println("Digite o segundo nome:");
		nome2 = leitor.next();
		
		System.out.println("Digite a segunda idade:");
		idade2 = leitor.nextInt();
		
		if(idade1 > idade2)
			System.out.println(nome1+"é mais velho");
		
		else if ( idade2 > idade1 )
			System.out.println(nome2+"é mais velho");
		
		
			
		

	}

}
