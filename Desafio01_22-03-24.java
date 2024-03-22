package Juan;
import java.util.Scanner;

public class Desafio06 {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite o seu batimento cardíaco: ");
		int batimento = scanner.nextInt();
		
		String urgente = "urgente!";
	
		if (idade > 60 && batimento > 150) {
			System.out.print(urgente.toUpperCase());	
		}
		
		else if (idade > 60 && batimento == 150) {
			System.out.print("Urgência moderada!");
			}
		
		else if (idade <= 60 && batimento > 150) {
			System.out.print("Urgência moderada!");
			}
		
		else if (idade <= 60 && batimento <= 150) {
			System.out.print("Não urgente!");
			}
		
	}
	
}
