package estruturadedecis�o;

import java.util.Scanner;

public class r8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String AEDB;
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		AEDB = leitor.next();
		
		if(AEDB.equals("AEDB"))
		System.out.println("Acesso permitido");
		else
		System.out.println("Voce n�o tem acesso ao sistema");
		

	}

}
