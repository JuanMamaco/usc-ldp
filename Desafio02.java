package Juan;
import java.util.Scanner;

public class Desafio03 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		int nota = scanner.nextInt();
		
		if(	nota >= 90) {
			
			System.out.print("Parabéns, aprovado!");
			
		}
		
		else if (nota >= 70) {
			
			System.out.print("Aprovado!");
			
		}
		
		else {
		
		System.out.print("Reprovado");
		
		}
		scanner.close();
	}

}
