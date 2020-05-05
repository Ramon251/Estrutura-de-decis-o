package estruturadedecisão;

import java.util.Scanner;

public class r6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		int media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a primeira nota: ");
		n1 = leitor.nextInt();
		
		System.out.println("digite a segunda nota: ");
		n2 = leitor.nextInt();
		
		System.out.println("digite a terceira nota: ");
		n3 = leitor.nextInt();
		
		media = (n1+n2+n3) /3;
		
		if(media> 7)
		System.out.println("aprovado");
		
		else
		System.out.println("reporvado");
		
		
		
	}

}
