package Aula10;

public class Exercicio01 {

	public static void main(String[] args) {
		int[] numeros = {15,30,45,60,75};
		int somaNumeros = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += numeros[i];
		}
		
		System.out.println("Resultado da soma: " + somaNumeros);

	}

}
