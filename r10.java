package estruturadedecisão;

import java.util.Scanner;

public class r10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		String  sexo, M, F;
		float altura, PesoM, PesoF;
		
		System.out.println("Qual sua altura?");
		altura = leitor.nextFloat();
		
		System.out.println("Qual o seu sexo M/F?");
		sexo = leitor.next();
		
		
		PesoM = (float) ((72.2 * altura) -58);
		PesoF = (float)	((62.1 * altura) -44.7);
		
		if(sexo.equals("M"))
		System.out.println( ((72.2 * altura) -58));
		
		if(sexo.equals("F"))
		System.out.println( (62.1 * altura) -44.7);
		
		
		
		
		

	}

}
